package com.company;

public class NnaturalNumberUsingRecursion {

    public static void main(String[] args) {
        System.out.println(fun(4));

    }

    static int fun(int n){
        if (n==0) return 0;

      return   fun(n-1)+n;

    }
    static int powerOfNumber(int a, int b){
        if (b==0) return 1;

        return powerOfNumber(a,b-1)*a;
    }
}
