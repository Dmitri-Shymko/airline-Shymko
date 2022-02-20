package com.epam.airline.logic;

import com.epam.airline.entity.aircraft.airplane.Airplane;
import com.epam.airline.entity.aircraft.balloon.Balloon;
import com.epam.airline.entity.aircraft.helicopter.Helicopter;
import com.epam.airline.entity.company.Company;

public class Finder {
    public int findCompanyFullCapacity(Company company) {
        int capacity = 0;
        for (int i = 0; i < company.getNumberOfAirplanes(); i++) {
            capacity += company.getAirplane()[i].getLoadCapacity();
        }
        for (int i = 0; i < company.getNumberOfHelicopters(); i++) {
            capacity += company.getHelicopter()[i].getLoadCapacity();
        }
        for (int i = 0; i < company.getNumberOfBalloons(); i++) {
            capacity += company.getBalloon()[i].getLoadCapacity();
        }
        return capacity;
    }

    public int findCompanyFullPassengerCapacity(Company company) {
        int numberOfPassengers = 0;
        for (int i = 0; i < company.getNumberOfAirplanes(); i++) {
            numberOfPassengers += company.getAirplane()[i].getMaxPassengerCapacity();
        }
        for (int i = 0; i < company.getNumberOfHelicopters(); i++) {
            numberOfPassengers += company.getHelicopter()[i].getMaxPassengerCapacity();
        }
        for (int i = 0; i < company.getNumberOfBalloons(); i++) {
            numberOfPassengers += company.getBalloon()[i].getMaxPassengerCapacity();
        }
        return numberOfPassengers;
    }
    
    public void findAircraftByFuelConsumption(Company company, double minValue, double maxValue) {
        for (Airplane airplane : company.getAirplane()) {
            if (airplane.getFuelConsumption() > minValue && airplane.getFuelConsumption() < maxValue) {
                System.out.println("Aircraft name is: " + airplane.getName()
                        + "\tFuel consumption is: " + airplane.getFuelConsumption());
            }
        }
        for (Helicopter helicopter : company.getHelicopter()) {
            if (helicopter.getFuelConsumption() > minValue && helicopter.getFuelConsumption() < maxValue) {
                System.out.println("Aircraft name is: " + helicopter.getName()
                        + "\tFuel consumption is: " + helicopter.getFuelConsumption());
            }
        }
        for (Balloon balloon : company.getBalloon()) {
            if (balloon.getFuelConsumption() > minValue && balloon.getFuelConsumption() < maxValue) {
                System.out.println("Aircraft name is: " + balloon.getName()
                        + "\tFuel consumption is: " + balloon.getFuelConsumption());
            }
        }
    }

}
