package com.company;

public class SearchInrotatedArray {
    public static void main(String[] args) {
            int[] arr={3,1,2};
            int target=1;
            search(arr,target);

    }
    static public void search(int[] nums, int target) {

        int pivot= pivot(nums);

        if(pivot== -1){
            System.out.println(Bbbsearch(nums,target,0,nums.length-1));
        }else if(target>=nums[0]){
            System.out.println(Bbbsearch(nums,target,0,pivot));
        }else {
            System.out.println(Bbbsearch(nums,target,pivot+1,nums.length-1));
        }

    }

    static  int Bbbsearch(int[] arr, int target, int start, int end){

        while (start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else if(target==arr[mid]){



                return mid;
            }



        }

        return -1;

    }
    static int pivot( int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start +(end-start)/2;
           if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
           if( mid > start && arr[mid-1] > arr[mid]){
               return mid-1;
           }
           if(arr[mid] <= arr[start]){
               end= mid-1;
           } else{
               start= mid+1;
           }
        }
        return -1;
    }

}
