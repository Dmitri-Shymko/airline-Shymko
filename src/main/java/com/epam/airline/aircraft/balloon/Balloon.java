package com.epam.airline.aircraft.balloon;

import com.epam.airline.aircraft.Aircraft;
import com.epam.airline.company.Company;

import java.util.Objects;

public class Balloon extends Aircraft {

    private Company company;
    private int balloonValue;
    private String gasType;

    public Balloon(long id, String name, String manufacturer) {
        super(id, name, manufacturer);
    }

    public Balloon(long id, String name, String manufacturer, Company company, int balloonValue, String gasType) {
        super(id, name, manufacturer);
        this.company = company;
        this.balloonValue = balloonValue;
        this.gasType = gasType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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
        if (!(o instanceof Balloon)) return false;
        if (!super.equals(o)) return false;
        Balloon balloon = (Balloon) o;
        return getBalloonValue() == balloon.getBalloonValue() && Objects.equals(getCompany(), balloon.getCompany()) && Objects.equals(getGasType(), balloon.getGasType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCompany(), getBalloonValue(), getGasType());
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "company=" + company +
                ", balloonValue=" + balloonValue +
                ", gasType='" + gasType + '\'' +
                '}';
    }
}
