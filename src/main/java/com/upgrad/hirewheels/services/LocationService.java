package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Location;

import java.util.List;

public interface LocationService {

    public Location insertIntoLocationTable(Location location);
    public List<Location> getLocationTable();
}
