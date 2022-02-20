package com.epam.airline.logic;

import com.epam.airline.entity.aircraft.Aircraft;

import java.util.Comparator;

public class MyComparator implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        if (o1.getMaxFlightRange() == o2.getMaxFlightRange()) {
            return 0;
        }
        if (o1.getMaxFlightRange() > o2.getMaxFlightRange()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
