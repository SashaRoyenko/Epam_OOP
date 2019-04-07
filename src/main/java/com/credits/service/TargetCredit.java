package com.credits.service;

import com.credits.model.Credit;
import com.credits.model.enums.CreditType;

public class TargetCredit extends Credit {
    private CreditType creditType;

    public TargetCredit() {
        creditType = CreditType.CAR;
    }

    public TargetCredit(int creditSum, int days, CreditType creditType) {
        super(creditSum, days);
        this.creditType = creditType;
    }

    public TargetCredit(int creditSum, int days) {
        super(creditSum, days);
    }

    public CreditType getCreditType() {
        return creditType;
    }

    public void setCreditType(CreditType creditType) {
        this.creditType = creditType;
    }

    @Override
    public double getDifference(double percent, double commision) {
        return getFullSum(percent, commision) - creditSum;
    }

    @Override
    public double getFullSum(double percent, double commision) {
        return creditSum * (1 + percent / 100. * days / 365.) + commision;
    }

    @Override
    public double monthPay(double percent, double commision) {
        return getFullSum(percent, commision) / (days / 30.);
    }

    @Override
    public String toString() {
        return "TargetCredit{" +
                "creditType=" + creditType +
                super.toString() +
                '}';
    }
}
