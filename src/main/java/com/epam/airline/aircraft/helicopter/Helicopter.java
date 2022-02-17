package com.epam.airline.aircraft.helicopter;

import com.epam.airline.aircraft.Aircraft;
import com.epam.airline.company.Company;

import java.util.Objects;

public class Helicopter extends Aircraft {

    private int rotorLength = 1;
    private int rotorStep;

    public Helicopter(long id, String name, String manufacturer) {
        super(id, name, manufacturer);
    }

    public Helicopter(long id,
                      String name,
                      String manufacturer,
                      int maxFlightRange,
                      double fuelConsumption,
                      int loadCapacity,
                      int maxPassengerCapacity) {
        super(id, name, manufacturer, maxFlightRange, fuelConsumption, loadCapacity, maxPassengerCapacity);
    }

    public Helicopter(long id, String name, String manufacturer, int rotorLength, int rotorStep) {
        super(id, name, manufacturer);
        this.rotorLength = rotorLength;
        this.rotorStep = rotorStep;
    }

    public int getRotorLength() {
        return rotorLength;
    }

    public void setRotorLength(int rotorLength) {
        this.rotorLength = rotorLength;
    }

    public int getRotorStep() {
        return rotorStep;
    }

    public void setRotorStep(int rotorStep) {
        this.rotorStep = rotorStep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return rotorLength == that.rotorLength && rotorStep == that.rotorStep;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rotorLength, rotorStep);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "rotorLength=" + rotorLength +
                ", rotorStep=" + rotorStep +
                '}';
    }
}
