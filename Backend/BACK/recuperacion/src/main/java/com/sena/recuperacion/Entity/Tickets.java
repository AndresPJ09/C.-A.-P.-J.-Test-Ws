package com.sena.recuperacion.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Tickets extends ABaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "schedule_id", nullable = false)
    private Schedules schedule;

    @ManyToOne
    @JoinColumn(name = "cabin_type_id", nullable = false)
    private CabinTypes cabinType;

    @Column(name = "extras", length = 255)
    private String extras;

    @Column(name = "payment_number", length = 50, nullable = false)
    private String paymentNumber;

    @Column(name = "issued_date", nullable = false)
    private LocalDateTime issuedDate;

    @Column(name = "passenger_name", length = 50, nullable = false)
    private String passengerName;

    @Column(name = "passenger_passport", length = 50, nullable = false)
    private String passengerPassport;

    @Column(name = "confirmed", nullable = false)
    private boolean confirmed;
    
    @Column(name = "passport_photo_path") // Nuevo campo para la ruta o nombre del archivo de la foto del pasaporte
    private String passportPhotoPath;

    public String getPassportPhotoPath() {
		return passportPhotoPath;
	}

	public void setPassportPhotoPath(String passportPhotoPath) {
		this.passportPhotoPath = passportPhotoPath;
	}

	public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Schedules getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedules schedule) {
        this.schedule = schedule;
    }

    public CabinTypes getCabinType() {
        return cabinType;
    }

    public void setCabinType(CabinTypes cabinType) {
        this.cabinType = cabinType;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public LocalDateTime getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDateTime issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerPassport() {
        return passengerPassport;
    }

    public void setPassengerPassport(String passengerPassport) {
        this.passengerPassport = passengerPassport;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}