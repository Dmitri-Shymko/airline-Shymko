package com.epam.airline.company;

import com.epam.airline.aircraft.Aircraft;
import com.epam.airline.aircraft.airplane.Airplane;
import com.epam.airline.aircraft.balloon.Balloon;
import com.epam.airline.aircraft.helicopter.Helicopter;
import com.epam.airline.datastructures.MyCollection;
import com.epam.airline.datastructures.MyDynamicArray;

import java.math.BigDecimal;
import java.util.Objects;

public class Company {
    private long companyId;
    private CompanyName companyName;
    private String address;
    private String registrationDate;
    private BigDecimal companyAnnualBudget;
    private final MyCollection<Airplane> airplanes = new MyDynamicArray();
    private final MyCollection<Helicopter> helicopters = new MyDynamicArray();
    private final MyCollection<Balloon> balloons = new MyDynamicArray();
    private int airplanesMaxCapacity = 10;
    private int helicoptersMaxCapacity = 8;
    private int balloonsMaxCapacity = 8;

    public Company(long companyId, CompanyName companyName, String address) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.address = address;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public BigDecimal getCompanyAnnualBudget() {
        return companyAnnualBudget;
    }

    public void setCompanyAnnualBudget(BigDecimal companyAnnualBudget) {
        this.companyAnnualBudget = companyAnnualBudget;
    }

    public int getAirplanesMaxCapacity() {
        return airplanesMaxCapacity;
    }

    public void setAirplanesMaxCapacity(int airplanesMaxCapacity) {
        this.airplanesMaxCapacity = airplanesMaxCapacity;
    }

    public int getHelicoptersMaxCapacity() {
        return helicoptersMaxCapacity;
    }

    public void setHelicoptersMaxCapacity(int helicoptersMaxCapacity) {
        this.helicoptersMaxCapacity = helicoptersMaxCapacity;
    }

    public int getBalloonsMaxCapacity() {
        return balloonsMaxCapacity;
    }

    public void setBalloonsMaxCapacity(int balloonsMaxCapacity) {
        this.balloonsMaxCapacity = balloonsMaxCapacity;
    }

    public Airplane[] getAirplane() {
        return airplanes.toArray(Airplane.class);
    }

    public Helicopter[] getHelicopter() {
        return helicopters.toArray(Helicopter.class);
    }

    public Balloon[] getBalloon() {
        return balloons.toArray(Balloon.class);
    }

    public int getNumberOfAirplanes() {
        return airplanes.size();
    }

    public int getNumberOfHelicopters() {
        return helicopters.size();
    }

    public int getNumberOfBalloons() {
        return balloons.size();
    }

    public boolean addAirplane(Airplane airplane) {
        if (getNumberOfAirplanes() < airplanesMaxCapacity) {
            airplanes.add(airplane);
            return true;
        }
        return false;

    }

    public boolean removeAirplane(Airplane airplane) {
        return airplanes.remove(airplane);
    }

    public boolean addHelicopter(Helicopter helicopter) {
        if (getNumberOfHelicopters() < helicoptersMaxCapacity) {
            helicopters.add(helicopter);
            return true;
        }
        return false;
    }

    public boolean removeHelicopter(Helicopter helicopter) {
        return helicopters.remove(helicopter);
    }

    public boolean addBalloon(Balloon balloon) {
        if (getNumberOfBalloons() < balloonsMaxCapacity) {
            balloons.add(balloon);
            return true;
        }
        return false;
    }

    public boolean removeBalloon(Balloon balloon) {
        return balloons.remove(balloon);
    }

    public double findCompanyFullCapacity(Company company) {
        int capacity = 0;
        for (int i = 0; i < company.getNumberOfAirplanes(); i++) {
            capacity += getAirplane()[i].getLoadCapacity();
        }
        for (int i = 0; i < company.getNumberOfHelicopters(); i++) {
            capacity += getHelicopter()[i].getLoadCapacity();
        }
        for (int i = 0; i < company.getNumberOfBalloons(); i++) {
            capacity += getBalloon()[i].getLoadCapacity();
        }
        return capacity;
    }

    public double findCompanyFullPassengerCapacity(Company company) {
        int numberOfPassengers = 0;
        for (int i = 0; i < company.getNumberOfAirplanes(); i++) {
            numberOfPassengers += getAirplane()[i].getMaxPassengerCapacity();
        }
        for (int i = 0; i < company.getNumberOfHelicopters(); i++) {
            numberOfPassengers += getHelicopter()[i].getMaxPassengerCapacity();
        }
        for (int i = 0; i < company.getNumberOfBalloons(); i++) {
            numberOfPassengers += getBalloon()[i].getMaxPassengerCapacity();
        }
        return numberOfPassengers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return companyId == company.companyId
                && airplanesMaxCapacity == company.airplanesMaxCapacity
                && helicoptersMaxCapacity == company.helicoptersMaxCapacity
                && balloonsMaxCapacity == company.balloonsMaxCapacity
                && companyName == company.companyName
                && Objects.equals(address, company.address)
                && Objects.equals(registrationDate, company.registrationDate)
                && Objects.equals(companyAnnualBudget, company.companyAnnualBudget)
                && Objects.equals(airplanes, company.airplanes)
                && Objects.equals(helicopters, company.helicopters)
                && Objects.equals(balloons, company.balloons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, address, registrationDate,
                companyAnnualBudget, airplanes, helicopters,
                balloons, airplanesMaxCapacity, helicoptersMaxCapacity, balloonsMaxCapacity);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName=" + companyName +
                ", address='" + address + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", companyAnnualBudget=" + companyAnnualBudget +
//                ", airplanes=" + airplanes +
//                ", helicopters=" + helicopters +
//                ", balloons=" + balloons +
                ", airplanesMaxCapacity=" + airplanesMaxCapacity +
                ", helicoptersMaxCapacity=" + helicoptersMaxCapacity +
                ", balloonsMaxCapacity=" + balloonsMaxCapacity +
                '}';
    }


}
