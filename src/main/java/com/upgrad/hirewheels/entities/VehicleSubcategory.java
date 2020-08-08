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
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubcategoryId;
    @Column( nullable = false, unique = true)
    private String vehicleSubcategoryName;
    @Column( nullable = false)
    private int vehicleCategoryId;
    @Column( nullable = false)
    private double pricePerHour;
    @OneToMany(mappedBy = "vehicleSubcategory", fetch = FetchType.LAZY)
    List<Vehicle> vehicles;

    @ManyToOne
    private VehicleCategory vehicleCategory;

    public VehicleSubcategory() {
    }

    public VehicleSubcategory(int vehicleSubcategoryId, String vehicleSubcategoryName, double pricePerHour) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.pricePerHour = pricePerHour;
    }
}
