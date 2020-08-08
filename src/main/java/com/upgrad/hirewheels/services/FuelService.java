package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Fuel;

import java.util.List;

public interface FuelService {

    public Fuel insertIntoFuelTable(Fuel fuel);
    public List<Fuel> getFuelTable();
}
