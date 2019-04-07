package com.credits.service.io;

import com.credits.model.Bank;
import com.credits.model.enums.CreditType;

import java.util.List;

public class Output {
    public static void showMainMenu() {
        System.out.println("\n1. Show list of all banks");
        System.out.println("2. Show by categories");
        System.out.println("3. exit");
    }

    public static void showChosenMenu() {
        System.out.println("\n1. Enter client credit details");
        System.out.println("2. Show banks sorted by current percent");
        System.out.println("3. Show banks which allows increase credit line");
        System.out.println("4. Show banks sorted by total sum");
    }

    public static void showBanksInfo(List<Bank> bank) {
        System.out.printf("\n%50s", "Bank information\n");
        System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|\n", "Name", "Car", "Realty", "Cash", "Card", "Business", "Increase Line");
        for (Bank b : bank) {
            System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|\n", b.getName(),
                    b.getPercent().get(CreditType.CAR),
                    b.getPercent().get(CreditType.REALTY),
                    b.getPercent().get(CreditType.CASH),
                    b.getPercent().get(CreditType.CARD),
                    b.getPercent().get(CreditType.BUSINESS),
                    b.isIncreaseCreditLine());
        }
    }

    public static void showUserCreditStatistic(List<Bank> bank) {
        System.out.printf("\n%50s", "Credit information\n");
        System.out.printf("|%-20s|%-13s|%-13s|%-13s|%-13s|\n", "Name", "Current sum", "Total Sum", "Difference", "Month Pay");
        for (Bank b : bank) {
            System.out.printf("|%-20s|%-13d|%-13.4f|%-13.4f|%-13.4f|\n",
                    b.getName(),
                    b.getTargetCredit().getCreditSum(),
                    b.getFullSum(),
                    b.getDifference(),
                    b.getMonthPay());
        }
    }

}
