package com.company;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerofhanoi(3,'A','C','B');
    }

    static void towerofhanoi(int n, char from,char to,char aux){
        if (n==0) return;

        towerofhanoi(n-1,from,aux,to);
        System.out.println("Move"+n+"from"+from+"to"+to);
        towerofhanoi(n-1,aux,to,from);
    }
}
