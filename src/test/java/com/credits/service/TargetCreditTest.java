package com.credits.service;

import org.junit.*;

import static junit.framework.TestCase.*;

public class TargetCreditTest {
    private int creditSum;
    private int days;
    private double commision;
    private double percent;
    @Before
    public void setParameters() {
        creditSum = 10000;
        days = 90;
        commision = 20;
        percent = 15;
    }

    @Test
    public void shouldReturnDifference() {
        double res = creditSum * (1 + percent / 100. * days / 365.) + commision - creditSum;
        assertEquals(res, new TargetCredit(creditSum, days).getDifference(percent, commision));
    }

    @Test
    public void shouldReturnFullSum() {
        double res = creditSum * (1 + percent / 100. * days / 365.) + commision;
        assertEquals(res, new TargetCredit(creditSum, days).getFullSum(percent, commision));
    }

    @Test
    public void shouldReturnMonthPay() {
        double res = (creditSum * (1 + percent / 100. * days / 365.) + commision) / (days / 30.);
        assertEquals(res, new TargetCredit(creditSum, days).monthPay(percent, commision));
    }
}