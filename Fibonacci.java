package com.firstpackage;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        for (int i=0; i<=10; i++){
            int summ=a+b;
            a=b;
            b=summ;
            System.out.println(summ);
        }
    }
}
