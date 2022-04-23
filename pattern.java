package com.company;

public class pattern {
    public static void main(String[] args) {
        pattern4(5);
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
        int mid = n/2;
        for (int i = 0; i <n ; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j+=2) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    }

