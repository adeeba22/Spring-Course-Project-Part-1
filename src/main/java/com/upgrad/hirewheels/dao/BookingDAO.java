package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.*;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Integer> {

    @Query("from Booking where userId=:userId")
    public Iterable<Booking> findByUserId(@Param("userId") int userId);

}

