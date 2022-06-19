package com.company;

import java.util.Arrays;

public class FindMaxDiff {
    public static void main(String[] args) {
        int[] arr= {9,3,5,1,4,2,1,8,1};
        int n= arr.length;
        int[] lMin=new int[n];
        int[] rMax=new int[n];
        int ans= 0;
        int max=0;
        lMin[0]=arr[0];
        for ( int i = 1; i < arr.length ; i++) {
            lMin[i]= Math.min(arr[i],lMin[i-1] );
        }
        rMax[arr.length-1]=arr[arr.length-1];
        for ( int i = arr.length-2; i >=0  ; i--) {
            rMax[i]= Math.max(arr[i],rMax[i+1] );
        }
        int i=0, j=0;
        while (i<n && j<n){
            if (lMin[i]<rMax[j]){
                ans= Math.max(ans,(j-i));
                j++;
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
