package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.VehicleCategory;

import java.util.List;

public interface VehicleCategoryService {

    public VehicleCategory insertIntoVehiclCategoryTable(VehicleCategory vehicleCategory);
    public List<VehicleCategory> getVehicleCategoryTable();
}
