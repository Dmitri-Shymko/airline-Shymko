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

    public MyCollection<Airplane> getAirplanes() {
        return airplanes;
    }

    public MyCollection<Helicopter> getHelicopters() {
        return helicopters;
    }

    public MyCollection<Balloon> getBalloons() {
        return balloons;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return getCompanyId() == company.getCompanyId()
                && getAirplanesMaxCapacity() == company.getAirplanesMaxCapacity()
                && getHelicoptersMaxCapacity() == company.getHelicoptersMaxCapacity()
                && getBalloonsMaxCapacity() == company.getBalloonsMaxCapacity()
                && getCompanyName() == company.getCompanyName()
                && Objects.equals(getAddress(), company.getAddress())
                && Objects.equals(getRegistrationDate(), company.getRegistrationDate())
                && Objects.equals(getCompanyAnnualBudget(), company.getCompanyAnnualBudget())
                && Objects.equals(getAirplanes(), company.getAirplanes())
                && Objects.equals(getHelicopters(), company.getHelicopters())
                && Objects.equals(getBalloons(), company.getBalloons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompanyId(), getCompanyName(), getAddress(), getRegistrationDate(),
                getCompanyAnnualBudget(), getAirplanes(), getHelicopters(), getBalloons(),
                getAirplanesMaxCapacity(), getHelicoptersMaxCapacity(), getBalloonsMaxCapacity());
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName=" + companyName +
                ", address='" + address + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", companyAnnualBudget=" + companyAnnualBudget +
                ", airplanes=" + airplanes +
                ", helicopters=" + helicopters +
                ", balloons=" + balloons +
                ", airplanesMaxCapacity=" + airplanesMaxCapacity +
                ", helicoptersMaxCapacity=" + helicoptersMaxCapacity +
                ", balloonsMaxCapacity=" + balloonsMaxCapacity +
                '}';
    }


}
