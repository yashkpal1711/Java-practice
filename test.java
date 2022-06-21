package com.company;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        int a= Math.max(4,4);
//        System.out.println(a);
        int [] a ={2,1,4};
        System.out.println(maxProfit(a));
    }
   static public int maxProfit(int[] prices) {
        int n= prices.length;
        int max=0;
        int[] lmin= new int[n];
        int[] rmax= new int[n];
        lmin[0]= prices[0];
        for(int i=1;i<n;i++){
            lmin[i]= Math.min(prices[i],lmin[i-1]);
        }
       System.out.println(Arrays.toString(lmin));
        rmax[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]= Math.max(rmax[i+1],prices[i]);
        }
       System.out.println(Arrays.toString(rmax));
        int i=0,j=0;
        while(i<n ){

            if(lmin[i]<rmax[j]){
                if (j-i>max){
                    max= rmax[j]-lmin[i];
                }
                j++;
            }else{
                i++;
            }
        }


        return max;

    }
}