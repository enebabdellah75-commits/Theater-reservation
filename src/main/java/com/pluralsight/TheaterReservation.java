package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TheaterReservation {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask for the customer's full name
        System.out.print("Please enter your name: ");
        String fullName = input.nextLine();

        // Split the full name into first and last name
        String[] names = fullName.trim().split("\\s+");
        String firstName = names[0];
        String lastName = names[names.length - 1];

        // Ask for the date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String showDate = input.nextLine();

        // Convert the date to yyyy-MM-dd format
        DateTimeFormatter inputFormat =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(showDate, inputFormat);


    }
}
