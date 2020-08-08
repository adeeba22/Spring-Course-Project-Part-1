package com.upgrad.hirewheels.dto;

import lombok.Data;

@Data
public class LocationDTO {

    int locationId;
    String locationName;
    String address;
    int cityId;
    String pincode;
}
