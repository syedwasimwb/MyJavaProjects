package com.firstpackage;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12325651;
        int rem = 0;
        int a = 0;
        while (n != 0) {
            rem = n % 10;
            a=a*10+rem;
            n = n / 10;

        }

        System.out.println(a);
    }
}
