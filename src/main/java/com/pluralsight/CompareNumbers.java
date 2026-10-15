package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("6 is even: " + isEven(6));
        System.out.println("5 is even: " + isEven(5));
        System.out.println("55 is positive: " + isPositive(55));
        System.out.println("-55 is positive: " + isPositive(-55));
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }
}
