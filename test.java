package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class test{


    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//
//        reverseInGroups(arr,5,3);
    }
   static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i=0;
       int j=0;
       j= Math.min(j+k,n-1);
        while(j<n && i<n){

            int m=j;
            while(i<m){
                Collections.swap(arr,i,m);
                m--;
                i++;
            }
            i=j+1;
            j= Math.min(j+k,n-1);
        }
        for(Integer x : arr){
            System.out.print(x+",");
        }
    }
}