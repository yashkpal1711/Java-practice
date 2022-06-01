package com.company;

public class SquareRoot {
    public static void main(String[] args) {
       int n =40;
        float temp=0;
        for (int i = 1; i <=n/2 ; i++) {
            if (i*i > n){
                temp = i-1;
                break;
            }
        }

        for (float i = temp; i <temp+1 ; i+=0.1) {
            if (i*i > n){
                temp = i-0.1f;
                break;
            }
        }
        for (float i = temp; i <temp+1 ; i+=0.01) {
            if (i*i > n){
                temp = i-0.01f;
                break;
            }
        }
        System.out.println(temp);
    }
}
