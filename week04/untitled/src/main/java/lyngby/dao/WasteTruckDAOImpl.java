package lyngby.dao;

import lyngby.RecyclingExercise.Driver;
import lyngby.RecyclingExercise.WasteTruck;

import java.util.List;

public class WasteTruckDAOImpl implements IWasteTruckDAO{
    @Override
    public void saveWasteTruck(String brand, String registrationNumber, int capacity) {

    }

    @Override
    public WasteTruck getWasteTruckById(int id) {
        return null;
    }

    @Override
    public void setWasteTruckAvailable(WasteTruck wasteTruck, boolean available) {

    }

    @Override
    public void deleteWasteTruck(int id) {

    }

    @Override
    public void addDriverToWasteTruck(WasteTruck wasteTruck, Driver driver) {

    }

    @Override
    public void removeDriverFromWasteTruck(WasteTruck wasteTruck, String id) {

    }

    @Override
    public List<WasteTruck> getAllAvailableTrucks() {
        return null;
    }
}
