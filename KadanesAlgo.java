package com.company;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5,};
        int currsum =0;
        int max= Integer.MIN_VALUE;
        int start=0;
        int end =0;

        for (int i = 0; i <arr.length ; i++) {
            currsum += arr[i];
            if(currsum<0){
                currsum=0;
                start= i+1;
            }
            if(start==1){
                start =0;
            }
            if(currsum>max){
                max=currsum;
                end=i;
            }
        }
        System.out.println(max);
        for (int i = start; i <=end ; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
