package com.credits.service.Check;

import com.credits.model.enums.CreditType;

import java.util.Scanner;

public class CheckInput {
    private static CreditType ct;
    private static Scanner scanner = new Scanner(System.in);

    public static int checkInteger(String input) {
        int number;
        System.out.print(input);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Incorrect Input!");
            System.out.print(input);
        }
        number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static CreditType getCreditType(String input) {
        String str;
        System.out.print(input);
        while (true) {
            str = scanner.next().toUpperCase();
            try {
                ct = CreditType.valueOf(str);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect input!");
            }
            System.out.print(input);
        }
        return ct;
    }
}
