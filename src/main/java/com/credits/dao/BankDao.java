package com.credits.dao;

import com.credits.model.Bank;
import com.credits.model.enums.CreditType;

import java.util.*;

public class BankDao implements Dao<Bank> {
    protected static List<Bank> bankList = new ArrayList<>();

    @Override
    public Bank get(int id) {
        return bankList.get(id);
    }

    @Override
    public void setTargetCreditValues(int sum, int days, CreditType type) {
        for (Bank i : getAll()) {
            i.setTargetCredit(sum, days, type);
        }
    }

    @Override
    public List<Bank> getAll() {
        return bankList;
    }

    @Override
    public void add(Bank bank) {
        bankList.add(bank);
    }

    @Override
    public void delete(int id) {
        bankList.remove(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankList);
    }

    @Override
    public String toString() {
        return "BankDao{" +
                "bankList=" + bankList +
                '}';
    }
}
