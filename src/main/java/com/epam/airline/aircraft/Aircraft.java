package com.epam.airline.aircraft;

import com.epam.airline.company.Company;
import com.epam.airline.company.CompanyName;

import java.util.Calendar;
import java.util.Objects;

public class Aircraft {
    private long id;
    private String name;
    private String manufacturer;
    private Calendar dateOfManufacture;
    private int maxAltitude;
    private int maxFlightRange;
    private double cruisingSpeed;
    private double maxSpeed;
    private double fuelConsumption;
    private int fuelCapacity;
    private int minFlightWeight;
    private int maxFlightWeight;
    private int loadCapacity;
    private int staffNumber;
    private int maxPassengerCapacity;
    private Company company;
    private CompanyName companyName;

    public Aircraft(long id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public Aircraft(long id,
                    String name,
                    String manufacturer,
                    int maxFlightRange,
                    double fuelConsumption,
                    int loadCapacity,
                    int maxPassengerCapacity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.maxFlightRange = maxFlightRange;
        this.fuelConsumption = fuelConsumption;
        this.loadCapacity = loadCapacity;
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Calendar getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Calendar dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightRange(int maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }

    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMinFlightWeight() {
        return minFlightWeight;
    }

    public void setMinFlightWeight(int minFlightWeight) {
        this.minFlightWeight = minFlightWeight;
    }

    public int getMaxFlightWeight() {
        return maxFlightWeight;
    }

    public void setMaxFlightWeight(int maxFlightWeight) {
        this.maxFlightWeight = maxFlightWeight;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return id == aircraft.id
                && maxAltitude == aircraft.maxAltitude
                && maxFlightRange == aircraft.maxFlightRange
                && Double.compare(aircraft.cruisingSpeed, cruisingSpeed) == 0
                && Double.compare(aircraft.maxSpeed, maxSpeed) == 0
                && Double.compare(aircraft.fuelConsumption, fuelConsumption) == 0
                && fuelCapacity == aircraft.fuelCapacity
                && minFlightWeight == aircraft.minFlightWeight
                && maxFlightWeight == aircraft.maxFlightWeight
                && loadCapacity == aircraft.loadCapacity
                && staffNumber == aircraft.staffNumber
                && maxPassengerCapacity == aircraft.maxPassengerCapacity
                && Objects.equals(name, aircraft.name)
                && Objects.equals(manufacturer, aircraft.manufacturer)
                && Objects.equals(dateOfManufacture, aircraft.dateOfManufacture)
                && Objects.equals(company, aircraft.company)
                && companyName == aircraft.companyName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, dateOfManufacture, maxAltitude, maxFlightRange,
                cruisingSpeed, maxSpeed, fuelConsumption, fuelCapacity, minFlightWeight, maxFlightWeight,
                loadCapacity, staffNumber, maxPassengerCapacity, company, companyName);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", maxAltitude=" + maxAltitude +
                ", maxFlightRange=" + maxFlightRange +
                ", cruisingSpeed=" + cruisingSpeed +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", minFlightWeight=" + minFlightWeight +
                ", maxFlightWeight=" + maxFlightWeight +
                ", loadCapacity=" + loadCapacity +
                ", staffNumber=" + staffNumber +
                ", maxPassengerCapacity=" + maxPassengerCapacity +
                ", company=" + company +
                ", companyName=" + companyName +
                '}';
    }
}
