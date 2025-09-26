package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.println(
                "Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        char option = scanner.next().charAt(0);

        float total = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + total);
        }
    }
