package com.credits.model;

import com.credits.model.enums.CreditType;
import com.credits.service.TargetCredit;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bank {
    private String name;
    private boolean increaseCreditLine;
    private double commission;
    private Map<CreditType, Double> percent;
    private TargetCredit targetCredit;

    public Bank() {
        targetCredit = new TargetCredit();
    }

    public Bank(String name, boolean increaseCreditLine, double commission, Map<CreditType, Double> percent, TargetCredit targetCredit) {
        this.name = name;
        this.increaseCreditLine = increaseCreditLine;
        this.commission = commission;
        this.percent = percent;
        this.targetCredit = targetCredit;
    }

    public Bank(String name, boolean increaseCreditLine, double commission, Map<CreditType, Double> percent) {
        this.name = name;
        this.increaseCreditLine = increaseCreditLine;
        this.commission = commission;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public boolean isIncreaseCreditLine() {
        return increaseCreditLine;
    }

    public double getCommission() {
        return commission;
    }

    public Map<CreditType, Double> getPercent() {
        return percent;
    }

    public TargetCredit getTargetCredit() {
        return targetCredit;
    }

    public Double getCurrentPercent() {
        return percent.get(targetCredit.getCreditType());
    }
    public void setTargetCredit(int sum, int days, CreditType creditType) {
       this.targetCredit = new TargetCredit(sum, days, creditType);
    }

    public double getDifference() {
        return targetCredit.getDifference(percent.get(targetCredit.getCreditType()), commission);
    }

    public double getFullSum() {
        return targetCredit.getFullSum(percent.get(targetCredit.getCreditType()), commission);
    }

    public double getMonthPay() {
        return targetCredit.monthPay(percent.get(targetCredit.getCreditType()), commission);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return increaseCreditLine == bank.increaseCreditLine &&
                Double.compare(bank.commission, commission) == 0 &&
                Objects.equals(name, bank.name) &&
                Objects.equals(percent, bank.percent) &&
                Objects.equals(targetCredit, bank.targetCredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, increaseCreditLine, commission, percent, targetCredit);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", increaseCreditLine=" + increaseCreditLine +
                ", commission=" + commission +
                ", percent=" + percent +
                ", targetCredit=" + targetCredit +
                '}';
    }

    public static class BankBuilder {
        private Bank newBank;

        public BankBuilder() {
            newBank = new Bank();
            newBank.percent = new HashMap<>();
        }

        public BankBuilder setTargetCredit(int sum, int days, CreditType creditType) {
            newBank.targetCredit = new TargetCredit(sum, days, creditType);
            return this;
        }

        public BankBuilder setPercent(Map<CreditType, Double> percent) {
            newBank.percent = percent;
            return this;
        }

        public BankBuilder setPercent(CreditType creditType, Double percent) {
            newBank.percent.put(creditType, percent);
            return this;
        }

        public BankBuilder setName(String name) {
            newBank.name = name;
            return this;
        }

        public BankBuilder setIncreaseCreditLine(boolean increaseCreditLine) {
            newBank.increaseCreditLine = increaseCreditLine;
            return this;
        }

        public BankBuilder setCommission(double commission) {
            newBank.commission = commission;
            return this;
        }

        public Bank build() {
            return newBank;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BankBuilder that = (BankBuilder) o;
            return Objects.equals(newBank, that.newBank);
        }

        @Override
        public int hashCode() {
            return Objects.hash(newBank);
        }

        @Override
        public String toString() {
            return "BankBuilder{" +
                    "newBank=" + newBank +
                    '}';
        }
    }

}

