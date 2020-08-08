package com.upgrad.hirewheels.dto;

import lombok.Data;

@Data
public class UsersDTO
{
    int userId;
    String firstName;
    String lastName;
    String password;
    String emailId;
    String mobileNo;
    int roleId;
    double walletMoney;
}
