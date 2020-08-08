package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UnauthorizedException;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersDAO usersDAO;

    @Override
    public Users insertIntoUsersTable(Users users) {
        return  usersDAO.save(users);
    }

    @Override
    public List<Users> getUsersTable() {
        return null;
    }

    @Override
    public Users getUsers(Users user) throws UserNotFoundException, UnauthorizedException {

        Users userInDb = usersDAO.findByEmailId(user.getEmailId()).orElseThrow(
                () -> new UserNotFoundException("User not registered"));

        if (!user.getPassword().equals(userInDb.getPassword())) {
            throw new UnauthorizedException("User Unauthorized");
        }
        return userInDb;


    }

    @Override
    public Users createUsers(Users users) throws UserAlreadyExistsException {
        if (usersDAO.findByEmailId(users.getEmailId()).isPresent())
            throw new UserAlreadyExistsException("Email Already Exists :" + users.getEmailId());

        if (usersDAO.findByMobileNo(users.getMobileNo()).isPresent())
            throw new UserAlreadyExistsException("Mobile Number Already Exists :" + users.getMobileNo());
        return usersDAO.save(users);

    }
}
