package com.epam.airline.aircraft.helicopter;

import com.epam.airline.aircraft.Aircraft;
import com.epam.airline.company.Company;

import java.util.Objects;

public class Helicopter extends Aircraft {

    private Company company;
    private int rotorLength = 1;
    private int rotorStep;

    public Helicopter(long id, String name, String manufacturer) {
        super(id, name, manufacturer);
    }

    public Helicopter(long id, String name, String manufacturer, Company company, int rotorLength, int rotorStep) {
        super(id, name, manufacturer);
        this.company = company;
        this.rotorLength = rotorLength;
        this.rotorStep = rotorStep;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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
        if (!(o instanceof Helicopter)) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return getRotorLength() == that.getRotorLength()
                && getRotorStep() == that.getRotorStep()
                && Objects.equals(getCompany(), that.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCompany(), getRotorLength(), getRotorStep());
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "company=" + company +
                ", rotorLength=" + rotorLength +
                ", rotorStep=" + rotorStep +
                '}';
    }
}
