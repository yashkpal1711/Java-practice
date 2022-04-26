package com.company;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2345, 5245, 522};

        System.out.println(even(nums));

    }

    static int even(int[] nums) {
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                count++;
            }

            if (count % 2 == 0) {
                count2++;
            }
        }
        return count2;
    }


}
