package com.taxiagency.domain;

import java.util.Objects;

public class Trip implements Entity {
    public String id;
    public String rout;
    public String car;
    public String driver;
    public String passenger;
    public int duration;

    public Trip(String id, String rout, String car, String driver, String passenger, int duration) {
        this.id = id;
        this.rout = rout;
        this.car = car;
        this.driver = driver;
        this.passenger = passenger;
        this.duration = duration;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return id.equals(trip.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id='" + id + '\'' +
                ", rout='" + rout + '\'' +
                ", car='" + car + '\'' +
                ", driver='" + driver + '\'' +
                ", passenger='" + passenger + '\'' +
                ", duration=" + duration +
                '}';
    }
}
