package com.upgrad.hirewheels.services;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UnauthorizedException;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;

import java.util.List;

public interface UsersService{

    public Users insertIntoUsersTable(Users users);
    public List<Users> getUsersTable();
    public Users createUsers(Users users) throws UserAlreadyExistsException;
    public Users getUsers(Users users) throws UserNotFoundException, UnauthorizedException;
}
