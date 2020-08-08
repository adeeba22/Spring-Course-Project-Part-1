package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.City;

import java.util.List;

public interface CityService {

    public City insertIntoCityTable(City city);
    public List<City> getCityTable();
}
