package com.epam.airline.logic;

import com.epam.airline.entity.aircraft.airplane.Airplane;
import com.epam.airline.entity.aircraft.balloon.Balloon;
import com.epam.airline.entity.aircraft.helicopter.Helicopter;
import com.epam.airline.entity.company.Company;

public class Finder {
    /**
     * Finding full load capacity of the all company aircrafts.
     * @param company
     * @return capacity (int)
     */
    public int findCompanyLoadCapacity(Company company) {
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

    /**
     * Finding maximum passenger capacity  of the all company aircrafts.
     * @param company
     * @return number of passenger (int)
     */
    public int findCompanyPassengerCapacity(Company company) {
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

    /**
     * Search for an aircraft that matches the user's fuel consumption.
     * @param company
     * @param minValue minimum value of fuel consumption
     * @param maxValue maximum value of fuel consumption
     */
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
