package com.company;

public class SumOfDigitsUsingRecursoin {
    public static void main(String[] args) {
        int n =1907789;
        System.out.println(fun(n));
    }

    static int fun(int n){
        if (n/10==0) return n;

        int lastDigit= n%10;
        return lastDigit + fun(n/10);

    }
}
