package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class test{
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,-2,5};
        int n = arr.length;
        System.out.println(Arrays.toString( maxSubarraySum(arr, n)));
//        int min =

    }
   static Integer[] maxSubarraySum (Integer arr[], int n){

//       Arrays.sort(arr);
       Collections.reverse(Arrays.asList(arr));
       int z = arr.length;
       for ( Integer x : arr){
           System.out.println(x +" ");
       }
       return arr;

    }
}