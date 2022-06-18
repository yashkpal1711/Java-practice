package com.company;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] ={1,8,6,2,4,5,8,3,7};
        int l=0;
        int r= arr.length-1;
        int max= Integer.MIN_VALUE;
        int area =0;
        while (l<r){
            int a=0,b=0;
            b= r-l;
            if (arr[l] < arr[r]) {
                a=arr[l];
                l++;
            }else{
                a=arr[r];
                r--;
            }

            area= a* b;
            if (area>max) max=area;

        }
        System.out.println(max);
    }
}
