package com.company;

public class N_MagicNumber {
    public static void main(String[] args) {
        int n= 10;// 1010
        int sum =0;
        int b = 1;
        while (n>0){
            int a= n&1;
            sum+= (int)(a*Math.pow(5,b));
            n=n>>1;
            b++;
        }
        System.out.println(sum);
    }
}
