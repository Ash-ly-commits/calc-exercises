package com.pluralsight;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = myScanner.nextLine();

        System.out.println("How many hours have you worked? ");
        float totalHours = myScanner.nextFloat();

        System.out.println("What is your pay rate? ");
        float payRate = myScanner.nextFloat();

        float grossPay = totalHours * payRate;
        System.out.println("Hello " + name + ".\nYour gross pay is: " + grossPay);
    }
}
