package com.company;

import java.util.Arrays;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.toString(arr));
//        swapmatrix(arr);
        RotateMatric90deg(arr);
    }
    static void RotateMatric90deg(int[][] arr){
//        step 1: transpose the matrix
//        step :2 replace the elements

        transposeMatrix(arr);
        int n= arr[1].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp= arr[i][j];
                arr[i][j]= arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");

        }

    }
    static int[][] transposeMatrix(int[][] arr){
        int n= arr[1].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
            
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println("");
//
//        }
        return arr;
    }
}
