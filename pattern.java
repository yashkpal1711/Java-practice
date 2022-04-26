package com.company;

public class pattern {
    public static void main(String[] args) {
        pattern7(5);
    }
    static  void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static  void pattern2(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }
        }
    static  void pattern3(int n){

            //  *
            //  * *
            //  * * *
            //  * *
            //  *

        int mid = (n/2)+1;
        for (int i = 1; i <=mid ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=mid-1 ; i++) {
            for (int j = mid-i ; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static  void pattern4(int n){
            //    *
            //   ***
            //  *****
            // *******
            //*********


        for (int i = 0; i <n ; i++) {
            for (int j = n-i-1; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = (1+2*i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static  void pattern5(int n){
        //    *
        //   ***
        //  *****
        // *******
        //*********

        int mid= (n/2)+1;
        for (int i = 0; i <mid ; i++) {
            for (int j = mid-i-1; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i <mid-1 ; i++) {
            for (int j = i; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = mid-i-1; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    static void pattern6(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    static void pattern7(int n){
        int originalN= n;
        n=2*n-2;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= n; j++) {
                int num =originalN- Math.min(Math.min(i,j), Math.min(n-i, n-j));
                System.out.print(num +" ");
            }
            System.out.println("");
        }
    }
    }

