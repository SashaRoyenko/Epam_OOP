package com.credits;

import com.credits.dao.BankList;
import com.credits.dao.Dao;
import com.credits.model.Bank;
import com.credits.model.enums.CreditType;
import com.credits.service.io.Controller;
import com.credits.service.io.Output;

public class Main {
    public static void main(String[] args) {
//        Dao<Bank> b = new BankList();
//        b.setTargetCreditValues(10000, 30, CreditType.CAR);
//        Output.showBanksInfo(b.getAll());
//        Output.showUserCreditStatistic(b.getAll());
        Controller.run();
    }
}
