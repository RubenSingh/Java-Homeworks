package com.company;

public class Main {

    public static void main(String[] args) {
        // even numbers
        System.out.println("Even Numbers");
        for (int i = 0; i<=100;i++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        // fibonacci numbers
        System.out.println("Fibonacci");
        int a = 0;
        int b = 1;
        for (int i = 1; i <=10; i++){
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }

    }


}
