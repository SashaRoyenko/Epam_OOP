package com.credits.dao;

import com.credits.model.Bank;
import com.credits.model.enums.CreditType;

import java.util.HashMap;

public class BankList extends BankDao {
    static {
        bankList.add(new Bank.BankBuilder()
                .setName("Ukrgazbank")
                .setCommission(0)
                .setIncreaseCreditLine(true)
                .setPercent(CreditType.CAR, 1.1)
                .setPercent(CreditType.REALTY, 2.58)
                .setPercent(CreditType.CASH, 2.49)
                .setPercent(CreditType.CARD, 0.58)
                .setPercent(CreditType.BUSINESS, 1.)
                .build());
        bankList.add(new Bank.BankBuilder()
                .setName("Alpha")
                .setCommission(0)
                .setIncreaseCreditLine(true)
                .setPercent(CreditType.CAR, 0.6)
                .setPercent(CreditType.REALTY, 1.505)
                .setPercent(CreditType.CASH, 1.66)
                .setPercent(CreditType.CARD, 0.75)
                .setPercent(CreditType.BUSINESS, 0.6)
                .build());
        bankList.add(new Bank.BankBuilder()
                .setName("Oshchad")
                .setCommission(0)
                .setPercent(CreditType.CAR, 1.41)
                .setPercent(CreditType.REALTY, 1.66)
                .setPercent(CreditType.CASH, 1.65)
                .setPercent(CreditType.CARD, 1.)
                .setPercent(CreditType.BUSINESS, 1.2)
                .build());
        bankList.add(new Bank.BankBuilder()
                .setName("Credit Agricol")
                .setCommission(0)
                .setPercent(CreditType.CAR, 1.45)
                .setPercent(CreditType.REALTY, 2.)
                .setPercent(CreditType.CASH, 2.3)
                .setPercent(CreditType.CARD, 2.)
                .setPercent(CreditType.BUSINESS, 1.)
                .build());
    }

}
