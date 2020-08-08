package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleDAO extends JpaRepository<Vehicle, Integer> {

    @Query("from Vehicle where userId=:roleId")
    public Iterable<Users> findByRoleId(@Param("roleId") int roleId);
}
