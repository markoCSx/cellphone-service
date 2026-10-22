package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static final Scanner userInput = new Scanner(System.in);

    static String userText;

    static CellPhone userCell = new CellPhone();

    public static void main(String[] args) {

        getPhoneData();
        phoneData();

    }

    private static void phoneData() {
        System.out.println("Serial Number: " + userCell.getSerialNumber());
        System.out.println("Model: " + userCell.getModel());
        System.out.println("Carrier: " + userCell.getCarrier());
        System.out.println("Phone Number: " + userCell.getPhoneNumber());
        System.out.println("Owner: " + userCell.getOwner());
    }

    public static void getPhoneData() {

        System.out.println("What is the serial number?");
        userText = userInput.nextLine();
        userCell.setSerialNumber(userText);

        System.out.println("What model is the phone?");
        userText = userInput.nextLine();
        userCell.setModel(userText);

        System.out.println("Who is the carrier?");
        userText = userInput.nextLine();
        userCell.setCarrier(userText);

        System.out.println("What is the phone number?");
        userText = userInput.nextLine();
        userCell.setPhoneNumber(userText);

        System.out.println("Who is the owner of the phone?");
        userText = userInput.nextLine();
        userCell.setOwner(userText);

    }


}
