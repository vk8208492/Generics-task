package app.service;

import app.entity.User;

import java.util.Scanner;

public class InfoServiceUser01 {

    Scanner scanner;
    String name;
    String surname;

    public String getData() {
        return formData(getInputs());
    }

    private User<String, String> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter user's name: ");
        name = scanner.nextLine();
        System.out.print("Enter user's surname: ");
        surname = scanner.nextLine();
        return new User(name, surname);
    }

    private String formData(User<String, String> User) {
        return "User's name is " + User.getName() +
                ", surname is " + User.getSurname();
    }
}

