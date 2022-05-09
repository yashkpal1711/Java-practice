package com.company;

class test{
    public static void main(String[] args) {
        int n = 13;
        int i=3;
        System.out.println((n&(1<<i-1))>>i-1);

    }
}