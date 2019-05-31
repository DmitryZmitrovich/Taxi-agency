package com.taxiagency.dao.car;

import com.taxiagency.domain.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class CarFileDao implements CarDao {
    @Override
    public List<Car> findbyColor(String color) {
        return null;
    }

    @Override
    public List<Car> findbyNumber(int number) {
        return null;
    }

    @Override
    public String save(Car obj) {
        return null;
    }

    @Override
    public void update(Car obj) {

    }

    @Override
    public String upsert(Car obj) {
        return null;
    }

    @Override
    public void delete(Car obj) {

    }

    @Override
    public Car findById(String id) {
        return null;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    public class Main {
        public void main(String[] args) {

            int bytesCount = 0;
            FileInputStream fis = null;
            try {
                fis = new FileInputStream("taxifiles.txt");
                bytesCount = fis.available();
                int data = 0;
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                }
            }

            System.out.println();

            try (FileInputStream fis1 = new FileInputStream("taxifiles.txt")) {
                int data = 0;
                while ((data = fis1.read()) != -1) {
                    System.out.print((char) data);
                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}