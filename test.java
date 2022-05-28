package com.company;

import java.util.Arrays;

class test{
    public static void main(String[] args) {

        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int row = image.length;
        int temp=0;
        int c = image[0].length ;

        for(int i=0; i<row ; i++){
            for(int j=0; j<(c+1/2) ;j++){
                temp = image[i][j];
                image[i][j]=image[i][c-j-1]^1;
                image[i][c-j-1] = temp ^ 1;
            }
        }
        for( int[] arr: image){
            for (int i = 0; i < c; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("");
        }
    }
}