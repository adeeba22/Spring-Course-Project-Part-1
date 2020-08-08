package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDAO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements AdminService{

    @Autowired
    VehicleDAO vehicleDao;

    @Override
    public Vehicle insertIntoVehicleTable(Vehicle vehicle) {
        return vehicleDao.save(vehicle);
    }

    @Override
    public Vehicle changeAvailability(Vehicle vehicle, String availabilityStatus) throws VehicleNotFoundException {
        Vehicle vehicleToUpdate =  getVehicleDetails(vehicle.getVehicleId());
        vehicleToUpdate.setAvailabilityStatus(availabilityStatus);
        vehicleDao.save(vehicleToUpdate);
        System.out.println("New avilabilty status :" + getVehicleDetails(vehicle.getVehicleId()).toString());
        return vehicleToUpdate;
    }

    public Vehicle getVehicleDetails(int id) throws VehicleNotFoundException{
        return vehicleDao.findById(id).orElseThrow(
        ()->  new VehicleNotFoundException("Vehicle not found for id" + id));
    }
}
