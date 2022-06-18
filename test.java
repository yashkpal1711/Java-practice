package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class test{
    public static void main(String[] args) {

       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        for (int i = 0; i < height.length-1; i++) {
            System.out.println(height[i]);
        }

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