package com.upgrad.hirewheels.dao;
import com.upgrad.hirewheels.*;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users, Integer> {

    Optional<Users> findByMobileNo(String mobileNo);
    Optional<Users> findByEmailId(String emailId);
    @Query("from Users where roleId=:roleId")
    public Iterable<Users> findByRoleId(@Param("roleId") int roleId);
}