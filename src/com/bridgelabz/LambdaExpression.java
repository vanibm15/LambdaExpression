package com.bridgelabz;

import java.util.regex.Pattern;

    @FunctionalInterface
    interface MobileNumber {
        void validUser(String mobileNumber);
    }

public class LambdaExpression {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        MobileNumber function = (mobileNumber)->{
            boolean check = Pattern.matches("^[0-9]{2}\\s[0-9]{10}$",mobileNumber);
            if (check == true) {
                System.out.println("Mobile number is Valid");
            }else
                System.out.println("Enter valid mobile number");
        };
        function.validUser("91 7894561231");
    }
}