package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDAO;
import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.dao.VehicleDAO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleDAO vehicleDAO;

    @Autowired
    BookingDAO bookingDao;

    @Override
    public Vehicle insertIntoVehicleTable(Vehicle vehicle) {
        return null;
    }

    @Override
    public List<Vehicle> getAllVehicle(Vehicle vehicle) {
        return vehicleDAO.findAll();
    }

    @Override
    public List<Vehicle> getVehicleByUserId(int id) {
        Iterable<Booking> bookingsIterable = bookingDao.findByUserId(id);
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (Booking booking : bookingsIterable) {
            vehicles.add(booking.getVehicle());
        }

        return vehicles;
    }
}
