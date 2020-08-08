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
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuelTypeId;
    @Column( nullable = false , unique = true)
    private String fuelType;
    @OneToMany(mappedBy = "fuel", fetch = FetchType.LAZY)
    List<Vehicle> vehicle;

    public Fuel() {
    }

    public Fuel(int fuelTypeId, String fuelType) {
        this.fuelTypeId = fuelTypeId;
        this.fuelType = fuelType;
    }
}
