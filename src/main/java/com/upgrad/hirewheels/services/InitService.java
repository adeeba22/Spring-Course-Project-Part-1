package com.upgrad.hirewheels.services;


import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.dto.RoleDTO;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InitService implements RoleService, UsersService, VehicleService, VehicleCategoryService, VehicleSubcategoryService, FuelService, CityService, LocationService{

    @Autowired
    RoleDAO roleDao;

    @Autowired
    UsersDAO usersDao;

    @Autowired
    VehicleDAO vehicleDao;

    @Autowired
    VehicleCategoryDAO vehicleCatergoryDao;

    @Autowired
    VehicleSubcatergoryDAO vehicleSubcatergoryDao;

    @Autowired
    FuelDAO fuelDao;

    @Autowired
    CityDAO cityDao;

    @Autowired
    LocationDAO locationDao;



    @Override
    public Role insertIntoRoleTable(Role role) {
        return roleDao.save(role);
    }

    @Override
    public List<Role> getRoleTable() {
        return roleDao.findAll();
    }

    @Override
    public Users insertIntoUsersTable(Users users)
    {
        return usersDao.save(users);
    }

    @Override
    public List<Users> getUsersTable() {
        return usersDao.findAll();
    }

    @Override
    public Users createUsers(Users users) throws UserAlreadyExistsException {

        return usersDao.save(users);
    }

    @Override
    public Users getUsers(Users users) {
        return usersDao.findByEmailId(users.getEmailId()).get();
    }

    @Override
    public VehicleCategory insertIntoVehiclCategoryTable(VehicleCategory vehicleCategory) {
        return vehicleCatergoryDao.save(vehicleCategory);
    }

    @Override
    public List<VehicleCategory> getVehicleCategoryTable() {
        return vehicleCatergoryDao.findAll();
    }

    @Override
    public Vehicle insertIntoVehicleTable(Vehicle vehicle) {
        return vehicleDao.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public List<Vehicle> getVehicleByUserId(int id) {
        return null;
    }

    @Override
    public VehicleSubcategory insertIntoVehicleSubcategoryTable(VehicleSubcategory vehicleSubcategory) {
        return vehicleSubcatergoryDao.save(vehicleSubcategory);
    }

    @Override
    public List<VehicleSubcategory> getVehicleSubcategoryTable() {
        return vehicleSubcatergoryDao.findAll();
    }

    @Override
    public Fuel insertIntoFuelTable(Fuel fuel)
    {
        return fuelDao.save(fuel);
    }

    @Override
    public List<Fuel> getFuelTable() {
        return fuelDao.findAll();
    }

    @Override
    public City insertIntoCityTable(City city)
    {
        return cityDao.save(city);
    }

    @Override
    public List<City> getCityTable() {
        return cityDao.findAll();
    }

    @Override
    public Location insertIntoLocationTable(Location location)
    {
        return locationDao.save(location);
    }

    @Override
    public List<Location> getLocationTable() {
        return locationDao.findAll();
    }
}
