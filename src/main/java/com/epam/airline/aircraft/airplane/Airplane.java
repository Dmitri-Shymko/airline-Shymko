package com.epam.airline.aircraft.airplane;

import com.epam.airline.aircraft.RunwayClass;
import com.epam.airline.company.Company;
import com.epam.airline.aircraft.Aircraft;

import java.util.Objects;

public class Airplane extends Aircraft {

    private Company company;
    private int wingspan = 1;
    private int takeoffSpeed = 1;
    private RunwayClass runwayClass;

    public Airplane(long id, String name, String manufacturer) {
        super(id, name, manufacturer);
    }

    public Airplane(long id, String name, String manufacturer, Company company, int wingspan, int takeoffSpeed, RunwayClass runwayClass) {
        super(id, name, manufacturer);
        this.company = company;
        this.wingspan = wingspan;
        this.takeoffSpeed = takeoffSpeed;
        this.runwayClass = runwayClass;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTakeoffSpeed() {
        return takeoffSpeed;
    }

    public void setTakeoffSpeed(int takeoffSpeed) {
        this.takeoffSpeed = takeoffSpeed;
    }

    public RunwayClass getRunwayClass() {
        return runwayClass;
    }

    public void setRunwayClass(RunwayClass runwayClass) {
        this.runwayClass = runwayClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;
        if (!super.equals(o)) return false;
        Airplane airplane = (Airplane) o;
        return getWingspan() == airplane.getWingspan()
                && getTakeoffSpeed() == airplane.getTakeoffSpeed()
                && Objects.equals(getCompany(), airplane.getCompany())
                && getRunwayClass() == airplane.getRunwayClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCompany(), getWingspan(), getTakeoffSpeed(), getRunwayClass());
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "company=" + company +
                ", wingspan=" + wingspan +
                ", takeoffSpeed=" + takeoffSpeed +
                ", runwayClass=" + runwayClass +
                '}';
    }
}
