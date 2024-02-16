package app.service;

import app.entity.User;
import app.utils.Rounder;

import java.util.Scanner;

public class InfoServiceUser02 {
    Scanner scanner;
    int registrationNumber;
    double amount;

    public String getData() {
        return formData(getInputs());
    }

    private User<String, String> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's registrationNumber: ");
        registrationNumber = scanner.nextInt();
        System.out.print("Enter client's purchase amount: ");
        amount = scanner.nextInt();
        return new User<>(registrationNumber,amount);
    }

    private String formData(User<String, String> user) {
        String amountRounded = Rounder.roundValue(user.getValue());
        return "User's registrationNumber is " + user.getRegistrationNumber() +
                ", purchase amount is EUR " + amountRounded ;
    }

}
