package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.dto.*;
import com.upgrad.hirewheels.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class RoleServiceImpl {
    @Qualifier("roleDAO")
    @Autowired
    private RoleDAO roleDAO;


}
