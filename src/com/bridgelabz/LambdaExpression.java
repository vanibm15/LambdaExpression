package com.bridgelabz;

import java.util.regex.Pattern;

    @FunctionalInterface
    interface PasswordRule2 {
        void validUser(String password);
    }

public class LambdaExpression {

    public static void main(String[] args) {
        PasswordRule2 function = (password)->{
            boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]).{8,}$",password);
            if (check == true) {
                System.out.println("Password is Valid");
            }else
                System.out.println("Enter valid password");
        };
        function.validUser("Vani@123");
    }
}