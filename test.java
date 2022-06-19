package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class test{
    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        int r= 1;
        int l=0;
        int temp=0;
        while(r<nums.length && l< nums.length){
         if(r< nums.length)   {
                if (nums[r] == 0) {
                    r++;
                    continue;
                }}
                if (nums[l] != 0) {
                    l++;
                    r++;
                    continue;
                }
            if(r< nums.length)   {
                if (nums[l] == 0 && nums[r] != 0) {
                    temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                    l++;
                    r++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}