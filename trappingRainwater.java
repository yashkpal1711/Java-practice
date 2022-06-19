package com.company;

import java.util.Arrays;

public class trappingRainwater {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int size= arr.length;
        int ans=0;int max=0;
        int[] l= new int[size];
        int[] r= new int[size];
        l[0]= arr[0];
        for(int i=1;i<size;i++){
            l[i]=Math.min(l[i-1],arr[i]);
        }
        r[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            r[i]=Math.min(r[i+1],arr[i]);
        }

        for(int i=0;i<size;i++){
            ans=(Math.min(l[i],r[i]))* 2;
            if (max<ans){
                max=ans;
            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        System.out.println(max);
    }
}
