package com.credits.dao;

import com.credits.model.Bank;
import com.credits.model.enums.CreditType;
import com.credits.service.comparators.PercentComparotor;

import java.util.List;

import com.credits.service.comparators.TotalSumComparator;
import org.junit.*;

import static junit.framework.TestCase.*;

public class BankListTest {
    private static List<Bank> res;
    private static BankDao banks;

    @BeforeClass
    public static void setParameters() {
        banks = new BankList();
    }

    @Test
    public void shouldSortListByCarPercent() {
        double[] carPercents = {0.6, 1.1, 1.41, 1.45};
        banks.setTargetCreditValues(10000, 30, CreditType.CAR);
        res = banks.getAll();
        res.sort(new PercentComparotor());
        for (int i = 0; i < 4; i++) {
            assertEquals(carPercents[0], res.get(0).getCurrentPercent());
        }
    }

    @Test
    public void shouldSortListByRealtyPercent() {
        double[] realtyPercents = {1.505, 1.66, 2.0, 2.58,};
        banks.setTargetCreditValues(10000, 30, CreditType.REALTY);
        res = banks.getAll();
        res.sort(new PercentComparotor());
        for (int i = 0; i < 4; i++) {
            assertEquals(realtyPercents[0], res.get(0).getCurrentPercent());
        }
    }

    @Test
    public void shouldSortListByCashPercent() {
        double[] cashPercents = {1.65, 1.66, 2.3, 2.49};
        banks.setTargetCreditValues(10000, 30, CreditType.CASH);
        res = banks.getAll();
        res.sort(new PercentComparotor());
        for (int i = 0; i < 4; i++) {
            assertEquals(cashPercents[0], res.get(0).getCurrentPercent());
        }
    }

    @Test
    public void shouldSortListByCardPercent() {
        double[] cardPercent = {0.58, 0.75, 0.58, 2.0};
        banks.setTargetCreditValues(10000, 30, CreditType.CARD);
        res = banks.getAll();
        res.sort(new PercentComparotor());
        for (int i = 0; i < 4; i++) {
            assertEquals(cardPercent[0], res.get(0).getCurrentPercent());
        }
    }

    @Test
    public void shouldSortListByBusinessPercent() {
        double[] businessPercents = {0.6, 1, 1, 1.2};
        banks.setTargetCreditValues(10000, 30, CreditType.BUSINESS);
        res = banks.getAll();
        res.sort(new PercentComparotor());
        for (int i = 0; i < 4; i++) {
            assertEquals(businessPercents[0], res.get(0).getCurrentPercent());
        }
    }


}