package com.bridgelabz;

import java.util.regex.Pattern;

    @FunctionalInterface
    interface FirstName {
        void validUser(String name);
    }

    public class LambdaExpression {

        public static void main(String[] args) {
            System.out.println("Welcome to User Registration program");
            FirstName function = (name)->{boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
                if (check == true) {
                    System.out.println("Firstname is Valid");
                }else
                    System.out.println("Enter valid name");
            };
            function.validUser("Vani");
        }

    }

