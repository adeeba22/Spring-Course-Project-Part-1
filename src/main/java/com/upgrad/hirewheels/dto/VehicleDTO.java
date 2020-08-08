package com.upgrad.hirewheels.dto;

import lombok.Data;

@Data
public class VehicleDTO {

    int vehicleId;
    String vehicleModel;
    String vehicleNumber;
    int vehicleSubcategoryId;
    String color;
    int locationId;
    int fuelTypeId;
    String availabilityStatus;
    String vehicleImageId;
}
