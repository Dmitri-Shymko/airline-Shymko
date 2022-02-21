package com.epam.airline.entity.aircraft.balloon;

import com.epam.airline.entity.aircraft.Aircraft;

import java.util.Objects;

public class Balloon extends Aircraft {

    private int balloonValue;
    private String gasType;

    public Balloon(long id, String name, String manufacturer) {
        super(id, name, manufacturer);
    }

    public Balloon(long id,
                   String name,
                   String manufacturer,
                   int maxFlightRange,
                   double fuelConsumption,
                   int loadCapacity,
                   int maxPassengerCapacity) {
        super(id, name, manufacturer, maxFlightRange, fuelConsumption, loadCapacity, maxPassengerCapacity);
    }

    public Balloon(long id, String name, String manufacturer, int balloonValue, String gasType) {
        super(id, name, manufacturer);
        this.balloonValue = balloonValue;
        this.gasType = gasType;
    }

    public int getBalloonValue() {
        return balloonValue;
    }

    public void setBalloonValue(int balloonValue) {
        this.balloonValue = balloonValue;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Balloon balloon = (Balloon) o;
        return balloonValue == balloon.balloonValue && Objects.equals(gasType, balloon.gasType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), balloonValue, gasType);
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "balloonValue=" + balloonValue +
                ", gasType='" + gasType + '\'' +
                '}';
    }
}
