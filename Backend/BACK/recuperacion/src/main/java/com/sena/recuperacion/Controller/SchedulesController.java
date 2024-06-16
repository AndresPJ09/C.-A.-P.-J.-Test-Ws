package com.sena.recuperacion.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sena.recuperacion.Entity.Schedules;
import com.sena.recuperacion.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController<Schedules, ISchedulesService> {

    protected SchedulesController(ISchedulesService service) {
        super(service, "Schedules");
    }
    
    @GetMapping("/search")
    public List<Schedules> searchFlights(
            @RequestParam Long departureAirportId,
            @RequestParam Long destinationAirportId,
            @RequestParam String departureDate,
            @RequestParam(required = false) String returnDate,
            @RequestParam boolean flexibleDates,
            @RequestParam(required = false, defaultValue = "Económica") String cabinType) {
        
        try {
            LocalDate departureLocalDate = LocalDate.parse(departureDate);
            LocalDateTime departureDateTime = departureLocalDate.atStartOfDay();

            List<Schedules> outboundFlights = service.searchFlights(departureAirportId, destinationAirportId, departureDateTime, flexibleDates);

            if (returnDate != null && !returnDate.isEmpty()) {
                LocalDate returnLocalDate = LocalDate.parse(returnDate);
                LocalDateTime returnDateTime = returnLocalDate.atStartOfDay();

                List<Schedules> returnFlights = service.searchFlights(destinationAirportId, departureAirportId, returnDateTime, flexibleDates);
                outboundFlights.addAll(returnFlights); // Agregar los vuelos de regreso a la lista de resultados
            }

            return outboundFlights;
        } catch (DateTimeParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid date format. Please provide date in yyyy-MM-dd format.", e);
        }
    }

    @GetMapping("/check-seats")
    public boolean checkSeatAvailability(
            @RequestParam Long scheduleId,
            @RequestParam int numberOfPassengers,
            @RequestParam String cabinType) {
        return service.checkSeatAvailability(scheduleId, numberOfPassengers, cabinType);
    }
}