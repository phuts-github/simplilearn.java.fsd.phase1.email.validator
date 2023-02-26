package com.simplilearn.email.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        // Email array list and values
        List<String> emailList = new ArrayList<>();
        emailList.add("human@mars.com");
        emailList.add("alian@earth.com");
        emailList.add("marsian@moon.com");
        emailList.add("saturnian@planet.com");

        // Scanner - user input reader
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter email address:: ");
        String inputUserEmail = sc.next();

        if (emailValidator.isValidEmail(emailList, inputUserEmail)) {
            System.out.println("Email address '" + inputUserEmail + "' is Valid");
        } else {
            System.out.println("Email address '" + inputUserEmail + "' is InValid");
        }
    }

    private boolean isValidEmail(List<String> emailList, String userEmail) {
        if (emailList.isEmpty()) {
            return false;
        }
        for(int i = 0; i < emailList.size(); i++) {
            if(emailList.get(i).equals(userEmail)) {
                return true;
            }
        }
        return false;
    }
}