package com.firstpackage;

import java.util.ArrayList;

public class RepeatingNumber {
    public static void main(String[] args) {
        int n=122341227;
//        int count =1;
        int temp=0;
        int x=0;
        ArrayList<Integer> lis=new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            lis.add(rem);
            n=n/10;
        }
        System.out.println("list is" + lis);
        for (int i=0;i< lis.size();i++){
            int count=1;
            for(int j=i+1;j<lis.size();j++){
                if(lis.get(j) == lis.get(i)){
                    count++;
                }
            }
            System.out.println("count is" + count);
            if(count>temp){
                temp=count;
                x=lis.get(i);
            }
        }

        System.out.println("most repetitive: " + x);

    }
}
