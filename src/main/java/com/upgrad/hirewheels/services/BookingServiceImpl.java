package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dto.*;
import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.BookingNotFoundException;
import com.upgrad.hirewheels.exceptions.InsufficientBalanceException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDAO bookingDao;

    @Autowired
    UsersDAO usersDAO;

    @Override
    public Booking insertIntoBookingTable(Booking booking) {
        return null;
    }

    @Override
    public Booking addBooking(Booking booking, Users user) throws InsufficientBalanceException {
        double accountBalance = user.getWalletMoney();
        double bookingAmount = booking.getAmount();
        if (accountBalance > bookingAmount) {
            return bookingDao.save(booking);
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }

    }

    public Booking getBookingDetails(int id) throws BookingNotFoundException {

        return bookingDao.findById(id).orElseThrow(
                () -> new BookingNotFoundException("Booking details not found"));
    }
}
