package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    public Vehicle insertIntoVehicleTable(Vehicle vehicle);
    public Vehicle changeAvailability(Vehicle vehicle, String status) throws VehicleNotFoundException;

}
