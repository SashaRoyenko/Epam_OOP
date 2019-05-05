package com.credits.service.Check;

import com.credits.model.enums.CreditType;

import java.util.Scanner;

public class CheckValues {

    public static  boolean checkPositive(int number){
        return number > 0;
    }

    public static boolean checkLowerThanLimit(int number, int limit){
        return number <= limit;
    }


}
