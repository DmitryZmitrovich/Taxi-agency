package com.taxiagency.dao.passenger;

import com.taxiagency.dao.RamDao;
import com.taxiagency.domain.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRamDao extends RamDao<Passenger> implements PassengerDao {

    private List<Passenger> data = new ArrayList<>();
    private String phonenumber;

    @Override
    public List<Passenger> findbyName(String name) {
        List<Passenger> result = new ArrayList<>();

        for (Passenger passenger : data) {
            if (passenger.getName().equals(name)) {
                result.add(passenger);
            }
        }
        return result;
    }


    @Override
    public List<Passenger> findbyPhoneRegexp(String name) {
        for (Passenger passenger : data) {
            if ((Boolean) passenger.getPhonenumber().equals(phonenumber)) {
                return (List<Passenger>) passenger;

            }
            return null;
        }
        return null;
    }

}

