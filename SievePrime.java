package com.company;

public class SievePrime {
    public static void main(String[] args) {
        int n = 41 ;

        boolean[] Arr = new boolean[n+1];

        for (int i = 2; i*i <n ; i++) {
            if(!Arr[i]){
                for (int j = i*2; j < n; j+=i) {
                    Arr[j]= true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!Arr[i]){
                System.out.println(i +" "+"prime");
            }
        }

    }
}
