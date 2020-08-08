package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity
public class    Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @Column( nullable = false)
    private String vehicleModel;
    @Column( nullable = false)
    private String vehicleNumber;
    private int vehicleSubcategoryId;
    @Column( nullable = false)
    private String color;
    @Column( nullable = false)
    private int locationId;
    @Column( nullable = false)
    private int fuelTypeId;
    @Column( nullable = false)
    private String availabilityStatus;
    @Column( nullable = false)
    private String vehicleImageId;
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.EAGER)
    List<Booking> booking;
    @ManyToOne
    private Fuel fuel;
    @ManyToOne
    private VehicleSubcategory vehicleSubcategory;
    @ManyToOne
    private Location location;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String vehicleModel, String vehicleNumber, int vehicleSubcategoryId, String color, int locationId, int fuelTypeId, String availabilityStatus, String vehicleImageId) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.color = color;
        this.locationId = locationId;
        this.fuelTypeId = fuelTypeId;
        this.availabilityStatus = availabilityStatus;
        this.vehicleImageId = vehicleImageId;
    }
}
