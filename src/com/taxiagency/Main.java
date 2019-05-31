package com.taxiagency;

import com.taxiagency.dao.Dao;
import com.taxiagency.dao.car.CarDao;
import com.taxiagency.dao.car.CarRamDao;
import com.taxiagency.dao.driver.DriverDao;
import com.taxiagency.dao.driver.DriverRamDao;
import com.taxiagency.dao.passenger.PassengerDao;
import com.taxiagency.dao.passenger.PassengerRamDao;
import com.taxiagency.dao.trip.TripDao;
import com.taxiagency.dao.trip.TripRamDao;
import com.taxiagency.domain.*;

public class Main {
    private static Dao<Entity> tripDao;

    public static void main(String[] args) {

        Driver driver = new Driver("1", "Ivan");
        Driver driver2 = new Driver("2", "Vadim");
        DriverDao driverDao= new DriverRamDao();
        driverDao.save(driver);
        driverDao.save(driver2);


        System.out.println(driverDao.findAll());
        System.out.println(driverDao.findById("1"));
        System.out.println(driverDao.findById("2"));
        System.out.println(driverDao.findByName("Ivan"));
        System.out.println(driverDao.findByName("Vadim"));


        Passenger passenger = new Passenger("3", "Anatoliy", "136264234");
        Passenger passenger2 = new Passenger("4", "Michail", "641516");
        PassengerDao passengerDao= new PassengerRamDao();
        passengerDao.save(passenger);
        passengerDao.save(passenger2);

        System.out.println(passengerDao.findAll());
        System.out.println(passengerDao.findById("3"));
        System.out.println(passengerDao.findById("4"));
        System.out.println(passengerDao.findbyName("Anatoliy"));
        System.out.println(passengerDao.findbyName("Michael"));
        System.out.println(passengerDao.findbyPhoneRegexp("136264234"));
        System.out.println(passengerDao.findbyPhoneRegexp("641516"));



        Car car = new Car("5", Color.black, 2356);
        Car car2 = new Car("6", Color.white, 3654);
        CarDao carDao = new CarRamDao();
        carDao.save(car);
        carDao.save(car2);

        System.out.println(carDao.findAll());
        System.out.println(carDao.findById("5"));
        System.out.println(carDao.findById("6"));
        System.out.println(carDao.findbyColor("black"));
        System.out.println(carDao.findbyColor("white"));
        System.out.println(carDao.findbyNumber(2356));
        System.out.println(carDao.findbyNumber(3654));


        Trip trip1 = new Trip("7", "tothecentre", "5", "1", "3", 30);
        Trip trip2 = new Trip("8", "tothesuburbs", "6", "2", "4", 50);
        TripDao tripDao= new TripRamDao();
        tripDao.save(trip1);
        tripDao.save(trip2);

        System.out.println(tripDao.findAll());
        System.out.println(tripDao.findById("7"));
        System.out.println(tripDao.findById("8"));
        System.out.println(tripDao.findByCar("5"));
        System.out.println(tripDao.findByCar("6"));
        System.out.println(tripDao.findByPassenger("3"));
        System.out.println(tripDao.findByPassenger("4"));


    }
}