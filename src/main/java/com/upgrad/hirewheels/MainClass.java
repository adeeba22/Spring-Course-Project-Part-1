package com.upgrad.hirewheels;

import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.*;
import com.upgrad.hirewheels.dao.*;

import java.time.LocalDateTime;
import java.util.*;

import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.upgrad.hirewheels.dao.UsersDAO;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UsersDAO usersDAO = (UsersDAO)context.getBean("usersDAO");
//        Users users1 = (Users) usersDAO.save(new Users(1,"Ifrah","Malik","If#123","ifrah@g","940081718",10000));
//        Users users2 = (Users) usersDAO.save(new Users(2,"Akash","Sinha","AK#123","Akash@g","940081717",10000));
//        Users users3 = (Users) usersDAO.save(new Users(3,"Ishwar","ABC","ISH#123","ISHW@g","940081700",10000));
//        Users users4 = (Users) usersDAO.save(new Users(4,"Srishti","Gupta","Stish#123","Srish@g","940081730",10000));
//        Users users5 = (Users) usersDAO.save(new Users(5,"Admin","Admin","admin@123","upgrad@gmail.com","9999999999",1001,10000));
//        List<Users> insertedUsersList = usersDAO.findAll();
//        insertedUsersList.forEach((users) -> {
//            System.out.println(users);
//        });
//        List<Users> usersList=usersDAO.findAll();
//        usersList.forEach(users -> System.out.println(users));
//
//            RoleDAO roleDAO = (RoleDAO)context.getBean("roleDAO");
//        Role role = (Role) roleDAO.save(new Role(1001,"Admin"));
//        Role role1 = (Role) roleDAO.save(new Role(1002,"User"));
//        Role role2 = (Role) roleDAO.save(new Role(1003,"Employee"));
//        List<Role> insertedRoleList = roleDAO.findAll();
//        insertedRoleList.forEach((roles)->{
//            System.out.println(roles);
//        });
//
//        Users userRole = new Users(1001);
//
//        try{
//            Iterable<Users> usersOptional = usersDAO.findByRoleId(1001);
//            for(Users u : usersOptional){
//                System.out.println(u);
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        List<Users> usersList1 = usersDAO.findAll();
//        usersList1.forEach(users -> System.out.println(users));
//
//        usersDAO.deleteAll();
//        roleDAO.deleteAll();

        InitService initService = (InitService) context.getBean("initService");

        Role role3 = new Role(1, "Admin");
        Role role4 = new Role(2, "User");
        initService.insertIntoRoleTable(role3);
        initService.insertIntoRoleTable(role4);

        Users users6 = new Users("Admin", "Admin", "admin@123", "upgrad@gmail.com", "9999999999", 1, 10000);
        initService.insertIntoUsersTable(users6);

        VehicleCategory vehicleCategory = new VehicleCategory(10, "Car");
        VehicleCategory vehicleCategory1 = new VehicleCategory(11, "Bike");
        initService.insertIntoVehiclCategoryTable(vehicleCategory);
        initService.insertIntoVehiclCategoryTable(vehicleCategory1);

        VehicleSubcategory vehicleSubcategory = new VehicleSubcategory(1, "SUV", 300);
        VehicleSubcategory vehicleSubcategory1 = new VehicleSubcategory(2, "SEDAN", 350);
        VehicleSubcategory vehicleSubcategory2 = new VehicleSubcategory(3, "HATCHBACK", 250);
        VehicleSubcategory vehicleSubcategory3 = new VehicleSubcategory(4, "CRUISER", 200);
        VehicleSubcategory vehicleSubcategory4 = new VehicleSubcategory(5, "DIRT BIKE", 200);
        VehicleSubcategory vehicleSubcategory5 = new VehicleSubcategory(6, "SPORTS BIKE", 150);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory1);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory2);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory3);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory4);
        initService.insertIntoVehicleSubcategoryTable(vehicleSubcategory5);

        Fuel fuel = new Fuel(1, "Petrol");
        Fuel fuel1 = new Fuel(1, "Diesel");
        initService.insertIntoFuelTable(fuel);
        initService.insertIntoFuelTable(fuel1);

        City city = new City(1, "Mumbai");
        initService.insertIntoCityTable(city);

        Location location = new Location(1, "Worli", "Dr E Moses Rd, Worli Naka, Upper Worli", 1, "400018");
        Location location2 = new Location(2, "Chembur", "Optic Complex", 1, "400019");
        Location location3 = new Location(3, "Powai", "Hiranandani Towers", 1, "400020");
        initService.insertIntoLocationTable(location);
        initService.insertIntoLocationTable(location2);
        initService.insertIntoLocationTable(location3);

        List<Role> role = initService.getRoleTable();
        List<Location> locations = initService.getLocationTable();
        List<Users> usersList = initService.getUsersTable();
        List<Fuel> fuelList = initService.getFuelTable();
        List<VehicleSubcategory> vehicleSubcategoryList = initService.getVehicleSubcategoryTable();
        List<VehicleCategory> vehicleCategoryList = initService.getVehicleCategoryTable();

        Users users7 = new Users("Admin1", "Admin1", "admin@1234", "upGradg@gmail.com", "7276802587", 1, 12000);
        UsersServiceImpl usersService = (UsersServiceImpl) context.getBean("userService");
        Users forBalanceCheck = null;
        try {
            forBalanceCheck = usersService.createUsers(users7);
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        //to do login user 4.5
        try {
            //setting wrong password to check User Unauthorized exception
            users7.setPassword("wrong");

            //to-do 4.6
            System.out.print(usersService.getUsers(users7));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }

        //t-do 6.2 checkpint 5
        VehicleDAO vehicleDAO = (VehicleDAO) context.getBean("vehicleDAO");
        AdminServiceImpl adminService = (AdminServiceImpl) context.getBean("adminService");
        Vehicle vehicle1 = new Vehicle(1, "Hyundai creta", "M150001", 1, "black", 1, 1, "1", "creta56");
        Vehicle vfromDb = adminService.insertIntoVehicleTable(vehicle1);

        //to-do 6.3 checkpoint 5
        List<Vehicle> insertedVehicle = vehicleDAO.findAll();
        insertedVehicle.forEach(vehicle2 -> System.out.println(vehicle2));

        //to-6.1 of checkpoint 6
        try {
            adminService.changeAvailability(vfromDb, "0");
        } catch (VehicleNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //to-Do 6.2 checkpoint 6
        BookingServiceImpl bookingService = (BookingServiceImpl) context.getBean("bookingService");
        Booking booking = new Booking(1, new Date(), new Date(), new Date(), 3000.00, 1, 1, forBalanceCheck.getUserId());
        try {
           Booking bookingFromDB =  bookingService.addBooking(booking, forBalanceCheck);

            //to-doo 6.3  check booking correctly enteredinthe table

            System.out.println(bookingService.getBookingDetails(bookingFromDB.getBookingId()));

        } catch (InsufficientBalanceException e) {
            System.out.print(e.getMessage());
        }catch (BookingNotFoundException e) {
            System.out.print(e.getMessage());
        }

        //to-do checkpoint 7.2
        VehicleServiceImpl vehicleService= (VehicleServiceImpl)context.getBean("vehicleService");
        vehicleService.getAllVehicle(vehicle1);

        try {
            List<Vehicle> allVehicles = vehicleService.getVehicleByUserId(forBalanceCheck.getUserId());

            allVehicles.forEach(x -> System.out.println(x.toString()));
        }catch (Exception e){
            System.out.print(e.getMessage());
        }


    }
}
