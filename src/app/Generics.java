package app;

import app.service.InfoServiceUser01;
import app.service.InfoServiceUser02;

import java.util.Scanner;

public class Generics {

    public static void main(String[] args){
        getOutPut(getData(getOption()));

    }

    private static int getOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1-get User name and surname.
                2-get User registrationNumber and purchase amount.
                """);
        return scanner.nextInt();
    }
    private static String getData(int option){
        String data;
        switch (option){
            case 1-> data = new InfoServiceUser01().getData();
            case 2-> data = new InfoServiceUser02().getData();
            default -> data = "No data";
        }
        return data;
    }
    private static void getOutPut(String outPut){
        System.out.println("\n" + outPut);
    }
}
