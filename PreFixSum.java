package com.company;

import java.util.HashSet;
import java.util.Set;

public class PreFixSum {
    public static void main(String[] args) {
        int[] arr={2,3,1,-4,3,2};
        System.out.println(subArrayWithZeroSum(arr));
    }
    static boolean subArrayWithZeroSum(int[] arr){
        int n= arr.length;
        int sum=0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
