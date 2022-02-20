package com.epam.airline;

import com.epam.airline.entity.aircraft.airplane.Airplane;
import com.epam.airline.entity.aircraft.helicopter.Helicopter;
import com.epam.airline.entity.company.Company;
import com.epam.airline.entity.company.CompanyName;
import com.epam.airline.logic.Finder;
import com.epam.airline.logic.MyComparator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws ParseException {

        Company company = new Company(123, CompanyName.BELKAVIA, "Minsk");

        Airplane airplane1 = new Airplane(1, "First", "Boeing", 6000, 2600, 10000, 189);
        Airplane airplane2 = new Airplane(2, "Second", "Boeing", 3000, 2590, 23000, 0);
        Airplane airplane3 = new Airplane(3, "Third", "Boeing", 4500, 3000, 30000, 0);
        Airplane airplane4 = new Airplane(4, "Fourth", "Airbus", 3600, 2300, 12000, 162);

        airplane1.setDateOfManufacture(2013, 11, 01);

        Helicopter helicopter1 = new Helicopter( 55, "NiceHell", "Mikoyan", 960, 600, 2000, 24);
        Helicopter helicopter2 = new Helicopter( 56, "Helicopter2", "Mikoyan", 1000, 560, 2000, 20);

        company.addAirplane(airplane1);
        company.addAirplane(airplane2);
        company.addAirplane(airplane3);
        company.addAirplane(airplane4);
        company.addHelicopter(helicopter1);
        company.addHelicopter(helicopter2);


        System.out.println(airplane1.toString());
        Finder finder = new Finder();
        System.out.println(finder.findCompanyFullCapacity(company));
        System.out.println(finder.findCompanyFullPassengerCapacity(company));

        ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
        airplanes.add(airplane1);
        airplanes.add(airplane2);
        airplanes.add(airplane3);
        airplanes.add(airplane4);

        for (Airplane airplane : airplanes) {
            System.out.println("Aircraft name: " + airplane.getName()
                    + " Maximum flight range is: " + airplane.getMaxFlightRange());
        }

        MyComparator flightRangeComparator = new MyComparator();
        airplanes.sort(flightRangeComparator);

        System.out.println("\nSorted:\n");

        for (Airplane airplane : airplanes) {
            System.out.println("Aircraft name: " + airplane.getName()
                    + " Maximum flight range is: " + airplane.getMaxFlightRange() );
        }

        finder.findAircraftByFuelConsumption(company, 2000.0, 2600);

    }
}
