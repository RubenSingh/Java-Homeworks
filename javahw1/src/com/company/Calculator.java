package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int rep = 0;


        while (rep == 0){
            System.out.println("Enter the action you want to do:  ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. exit");
            int choice = myObj.nextInt();

            System.out.print("Enter first number: ");
            int a = myObj.nextInt();
            System.out.print("Enter second number: ");
            int b = myObj.nextInt();

            switch (choice) {
                case 1 -> System.out.println(a + b);
                case 2 -> System.out.println(a - b);
                case 3 -> System.out.println(a * b);
                case 4 -> System.out.println(a / b);
                case 5 -> rep = 1;
            }
        }
    }
}
