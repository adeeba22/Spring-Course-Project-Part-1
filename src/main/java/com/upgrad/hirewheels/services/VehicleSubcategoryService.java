package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Role;
import com.upgrad.hirewheels.entities.VehicleSubcategory;

import java.util.List;

public interface VehicleSubcategoryService {

    public VehicleSubcategory insertIntoVehicleSubcategoryTable(VehicleSubcategory vehicleSubcategory);
    public List<VehicleSubcategory> getVehicleSubcategoryTable();
}
