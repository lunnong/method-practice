package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What's your first name?");
        String firstName = myScanner.nextLine();
        System.out.println("What's your last name?");
        String lastName = myScanner.nextLine();
        String fullName = formatName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
