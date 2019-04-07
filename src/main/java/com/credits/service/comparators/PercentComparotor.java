package com.credits.service.comparators;

import com.credits.model.Bank;

import java.util.Comparator;

public class PercentComparotor implements Comparator<Bank> {

    @Override
    public int compare(Bank o1, Bank o2) {
        return o1.getCurrentPercent().compareTo(o2.getCurrentPercent());
    }

}
