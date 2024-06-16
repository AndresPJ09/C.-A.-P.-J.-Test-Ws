package com.sena.recuperacion.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.CabinTypes;
import com.sena.recuperacion.Entity.Schedules;
import com.sena.recuperacion.IRepository.CabinTypesRepository;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.SchedulesRepository;
import com.sena.recuperacion.IService.ISchedulesService;

@Service
public class SchedulesService extends ABaseService<Schedules> implements ISchedulesService {

	@Autowired
    private SchedulesRepository repository;

    @Autowired
    private CabinTypesRepository cabinTypesRepository;

    @Override
    protected IBaseRepository<Schedules, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Schedules> searchFlights(Long departureAirportId, Long destinationAirportId, LocalDateTime departureDate, boolean flexibleDates) {
        LocalDateTime startDate = departureDate;
        LocalDateTime endDate = departureDate;
        if (flexibleDates) {
            startDate = departureDate.minusDays(3);
            endDate = departureDate.plusDays(3);
        }
        return repository.findFlightsByAirportAndDateNative(departureAirportId, destinationAirportId, startDate, endDate);
    }

    @Override
    public double calculateTicketPrice(Long scheduleId, Long cabinTypeId) {
        Schedules schedule = repository.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("Flight schedule not found"));

        CabinTypes cabinType = cabinTypesRepository.findById(cabinTypeId)
                .orElseThrow(() -> new RuntimeException("Cabin type not found"));
        
        double basePrice = schedule.getPrice();
        double priceMultiplier = cabinType.getPriceMultiplier();

        if (cabinType.getName().equals("Ejecutiva")) {
            priceMultiplier *= 1.35; // Sobrecosto del 35% para la clase ejecutiva
        } else if (cabinType.getName().equals("Primera Clase")) {
            priceMultiplier *= 1.30; // Sobrecosto del 30% sobre la clase ejecutiva
        }

        double finalPrice = basePrice * priceMultiplier;
        return Math.round(finalPrice); // Redondear al número entero más cercano
    }

    @Override
    public boolean checkSeatAvailability(Long scheduleId, int numberOfPassengers, String cabinType) {
        Schedules schedule = repository.findConfirmedScheduleById(scheduleId);
        if (schedule == null) {
            throw new RuntimeException("Flight schedule not found or not confirmed");
        }
        
        int availableSeats = 0;
        switch (cabinType) {
            case "Económica":
                availableSeats = schedule.getAircraft().getEconomySeats();
                break;
            case "Ejecutiva":
                availableSeats = schedule.getAircraft().getBusinessSeats();
                break;
            case "Primera Clase":
                availableSeats = schedule.getAircraft().getTotalSeats() - schedule.getAircraft().getEconomySeats() - schedule.getAircraft().getBusinessSeats();
                break;
            default:
                throw new RuntimeException("Invalid cabin type");
        }

        return availableSeats >= numberOfPassengers;
    }
}