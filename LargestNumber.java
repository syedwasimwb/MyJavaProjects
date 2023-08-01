package com.firstpackage;

public class LargestNumber {
    public static void main(String[] args) {
        int a=10,b=20,c=3;
        if(a>b && a>c){
            System.out.println("max value is : "+ a);
        } else if (b>c) {
            System.out.println("max value is : "+ b);
        }
        else{
            System.out.println("max value is : "+ c);
        }

    }
}
