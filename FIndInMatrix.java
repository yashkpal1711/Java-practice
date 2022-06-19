package com.company;

public class FIndInMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,4,5,7},
                {2,5,6,9},
                {6,10,11,13}};
        int key= 198;
        int i= 0;
        int j= arr[0].length-1;
        boolean ans= false;
        while (i<arr[0].length-1 && j>0){
            if (arr[i][j]==key){
                ans=true;
//                System.out.println(ans);
                break;
            }else if(arr[i][j]>key){
                j--;
            }else {
                i++;
            }
        }
        System.out.println(ans);
    }
}
