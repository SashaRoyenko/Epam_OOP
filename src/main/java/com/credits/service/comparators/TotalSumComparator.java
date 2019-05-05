package com.credits.service.comparators;

import com.credits.model.Bank;

import java.util.Comparator;

public class TotalSumComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank o1, Bank o2) {
        return Double.compare(o1.getFullSum(), o2.getFullSum());
    }
}
