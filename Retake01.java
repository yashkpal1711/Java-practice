package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Retake01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList DyArray = new ArrayList();
//        System.out.println("enter ");
//        int n= in.nextInt();
//        for (int i = 0; i < 5; i++) {

//        DyArray.set(1,7);
//        DyArray.set(2,4);
//        DyArray.set(3,6);
//        DyArray.set(4,5);
        DyArray.add(1);
        DyArray.add(10);
        DyArray.set(0, 3);
////            int x= in.nextInt();
//            DyArray.set(i,i);
//        }
//        for ( Integer i : DyArray){
//            System.out.println(i);
//        }
        int y = in.nextInt();
        DyArray.add(y);
        for (int i = 0; i <2; i++) {
            System.out.println(DyArray);
        }
        System.out.println(DyArray.get(1));
    }
}
