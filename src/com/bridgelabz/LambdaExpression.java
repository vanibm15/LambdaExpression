package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface PasswordRule4 {
    void validUser(String password);
}

public class LambdaExpression {

    public static void main(String[] args) {
        PasswordRule4 function = (password)->{
            boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]{1,}).{8,}$",password);
            if (check == true) {
                System.out.println("Password is Valid");
            }else
                System.out.println("Password Is Invalid");
        };
        function.validUser("Vani@1234");
    }
}