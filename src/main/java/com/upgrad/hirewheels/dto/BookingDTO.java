package com.upgrad.hirewheels.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class BookingDTO {

    int bookingId;
    Date pickupDate;
    Date dropoffDate;
    Date bookingDate;
    double amount;
    int locationId;
    int vehicleId;
    int userId;
    }
