package com.company;

public class XORfrom0Toa {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        while(n>0){
            a= a^n;
            System.out.print(a+" ");
            n--;
        }
        System.out.println("");
        System.out.println(a);
    }
}
