package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

import java.util.List;

public interface VehicleService {

    public Vehicle insertIntoVehicleTable(Vehicle vehicle);
    public List<Vehicle> getAllVehicle(Vehicle vehicle);

    public List<Vehicle> getVehicleByUserId(int id)    ;
}
