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
public class VehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleCategoryId;
    @Column( nullable = false, unique = true)
    private String vehicleCategoryName;

    @OneToMany(mappedBy = "vehicleCategory", fetch = FetchType.LAZY)
    List<VehicleSubcategory> vehicleSubcategory;

    public VehicleCategory() {
    }

    public VehicleCategory(int vehicleCategoryId, String vehicleCategoryName) {
        this.vehicleCategoryId = vehicleCategoryId;
        this.vehicleCategoryName = vehicleCategoryName;
    }
}
