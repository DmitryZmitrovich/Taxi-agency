package com.taxiagency.domain;

        import java.util.Objects;

public class Car implements Entity {

    public String id;
    public Color color;
    public int number;

    public Car(String id, Color color, Integer number) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber(String number) {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }


}

