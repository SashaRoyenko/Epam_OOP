package com.credits.service.io;

import com.credits.dao.*;
import com.credits.model.Bank;
import com.credits.model.enums.CreditType;
import com.credits.service.Check.CheckInput;
import com.credits.service.comparators.*;
import java.util.List;

public class Controller {
    private static int answer;
    private static Dao<Bank> bankList = new BankList();

    private static void mainMenu() {
        Output.showMainMenu();
        answer = CheckInput.checkInteger("Enter answer: ");
        switch (answer) {
            case 1:
                Output.showBanksInfo(bankList.getAll());
                break;
            case 2:
                chosenMenu();
                break;
            default:
                System.exit(0);
        }
    }

    private static void chosenMenu() {
        List<Bank> temp = bankList.getAll();
        Output.showChosenMenu();
        answer = CheckInput.checkInteger("Enter answer: ");
        switch (answer) {
            case 1:
                inputCreditParameters();
                break;
            case 2:
                temp.sort(new PercentComparotor());
                Output.showBanksInfo(temp);
                break;
            case 3:
                temp.removeIf(i -> (!i.isIncreaseCreditLine()));
                Output.showBanksInfo(temp);
                break;
            case 4:
                temp.sort(new TotalSumComparator());
                Output.showBanksInfo(temp);
                Output.showUserCreditStatistic(temp);
                break;
            default:
                mainMenu();
        }
    }

    private static void inputCreditParameters() {
        int sum = CheckInput.checkInteger("Enter sum of credit: ");
        int days = CheckInput.checkInteger("Enter days of credit: ");
        CreditType ct = CheckInput.getCreditType("Enter credit type: ");
        bankList.setTargetCreditValues(sum, days, ct);
    }

    public static void run() {
        while (true) {
            mainMenu();
        }
    }
}
