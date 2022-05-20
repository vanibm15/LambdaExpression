package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface PasswordAllRule {
    void validUser(String password);
}

public class LambdaExpression {

    public static void main(String[] args) {
        PasswordAllRule PasswordAllRule = (password) -> {
            boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]{1,}).{8,}$", password);
            if (check == true) {
                System.out.println("Password is Valid");
            } else
                System.out.println("Password Is Invalid");
        };
            com.bridgelabz.PasswordAllRule function;
            function.validUser("Amol@1234");
        };

}