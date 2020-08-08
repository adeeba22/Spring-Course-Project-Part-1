package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    @Column( nullable = false)
    private Date pickupDate;
    @Column( nullable = false)
    private Date dropoffDate;
    @Column( nullable = false)
    private Date bookingDate;
    @Column( nullable = false)
    private double amount;
    @Column( nullable = false)
    private int locationId;
    @Column( nullable = false)
    private int vehicleId;
    @Column( nullable = false)
    private int userId;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Location location;
    @ManyToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;

    public Booking() {
    }

    public Booking(int bookingId, Date pickupDate, Date dropoffDate, Date bookingDate, double amount, int locationId, int vehicleId, int userId) {
        this.bookingId = bookingId;
        this.pickupDate = pickupDate;
        this.dropoffDate = dropoffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
        this.locationId = locationId;
        this.vehicleId = vehicleId;
        this.userId = userId;
    }
}
