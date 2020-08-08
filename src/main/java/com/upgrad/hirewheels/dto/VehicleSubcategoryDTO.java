package com.upgrad.hirewheels.dto;

import lombok.Data;

@Data
public class VehicleSubcategoryDTO
{
    int vehicleSubcategoryId;
    String vehicleSubcategoryName;
    int vehicleCategoryId;
    double pricePerHour;

}
