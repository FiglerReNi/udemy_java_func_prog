package org.example.service;

public class FuncProgService {

    public static void print(int number) {
        System.out.println(number);
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int sum(int a, int b){
        System.out.println(a + " " + b);
        return a + b;
    }
}
