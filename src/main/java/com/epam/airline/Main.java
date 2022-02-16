package com.epam.airline;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = new GregorianCalendar(2016, 0 , 25);
        Date date = calendar.getTime();
        System.out.println(date);

    }

}
