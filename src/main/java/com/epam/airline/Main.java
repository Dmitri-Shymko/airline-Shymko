package com.epam.airline;

import com.epam.airline.aircraft.airplane.Airplane;
import com.epam.airline.company.Company;
import com.epam.airline.company.CompanyName;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = new GregorianCalendar(2016, 0 , 25);
        Date date = calendar.getTime();
        System.out.println(date);

        Company company = new Company(123, CompanyName.BELKAVIA, "Minsk" );

        Airplane airplane1 = new Airplane(1, "First", "Boing", 6000, 2600, 10000, 189);
        Airplane airplane2 = new Airplane(2, "Second", "Boing", 3000, 2590, 23000, 0);
        Airplane airplane3 = new Airplane(3, "Third", "Boing", 4500, 3000, 30000, 0);
        Airplane airplane4 = new Airplane(4, "Fourth", "Airbus", 3600, 2300, 12000, 162);

        company.addAirplane(airplane1);
        company.addAirplane(airplane2);
        company.addAirplane(airplane3);
        company.addAirplane(airplane4);


        System.out.println(airplane1.toString());
        System.out.println(company.findCompanyFullCapacity(company));





    }
}
