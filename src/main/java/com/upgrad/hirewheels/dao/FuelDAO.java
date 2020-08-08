package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.*;
import com.upgrad.hirewheels.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelDAO extends JpaRepository<Fuel, Integer> {
}
