package com.firstpackage;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        ch=Character.toLowerCase(ch);
        System.out.println("character is " + ch);
    }
}
