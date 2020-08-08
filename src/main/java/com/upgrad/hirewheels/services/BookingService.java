package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.InsufficientBalanceException;

public interface BookingService {

    public Booking insertIntoBookingTable(Booking booking);
    public Booking addBooking(Booking booking, Users user) throws InsufficientBalanceException;
}
