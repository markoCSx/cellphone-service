package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText;

        CellPhone userCell = new CellPhone();

        System.out.println("What is the serial number?");
        userText = userInput.nextLine();
        userCell.setSerialNumber(userText);

    }
}
