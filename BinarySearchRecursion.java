package com.company;

public class BinarySearchRecursion {
    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8};
            int target = 8;
        System.out.println(BS(arr,target,0, arr.length-1)+1);
    }

    static int BS(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s +(e-s)/2;
        if (arr[m] == target){
            return m;
        }else if (target > m){
            s=m+1;
        }else if(target<m){
            e=m-1;
        }
        return BS(arr,target,s,e);
    }
}
