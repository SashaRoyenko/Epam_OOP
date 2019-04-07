package com.credits.dao;

import com.credits.model.Bank;
import com.credits.model.enums.CreditType;

import java.util.List;

public interface Dao<T> {

    public T get(int id);

    public List<T> getAll();

    public void add(T t);

    public void setTargetCreditValues(int sum, int days, CreditType type);

    public void delete(int id);
}