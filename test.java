package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4,4,5,5,6,6};
        int temp = arr[0];
        int n =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==temp){
                    n=j;
                }else{
                    arr[n]=arr[j];
                    temp= arr[j];
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(n-1);

    }

}