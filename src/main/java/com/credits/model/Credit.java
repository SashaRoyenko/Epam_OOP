package com.credits.model;

import java.util.Objects;

public abstract class Credit {
    protected int days;
    protected int creditSum;

    protected Credit() {
    }

    public Credit(int creditSum, int days) {
        this.creditSum = creditSum;
        this.days = days;
    }

    public abstract double getDifference(double percent, double commision);

    public abstract double getFullSum(double percent, double commision);

    public abstract double monthPay(double percent, double commision);

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(int creditSum) {
        this.creditSum = creditSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return days == credit.days &&
                creditSum == credit.creditSum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, creditSum);
    }

    @Override
    public String toString() {
        return " Credit{" +
                "days=" + days +
                ", creditSum=" + creditSum +
                '}';
    }
}

