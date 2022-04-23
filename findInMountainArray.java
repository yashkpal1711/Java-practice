package com.company;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] MountainArray = {0,5,3,1};
//        [1,2,1,3,5,6,4]
//        [0,5,3,1]
//        1
        int target = 1;


        System.out.println(search(MountainArray,target));
    }
    static int search(int[] arr, int target) {
        int peak=0;
        int start = 0;
        int end = arr.length - 1;





        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        peak=start;


        start=0;
        end= peak;

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

        start=peak+1;
        end = arr.length-1;

        while (start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){

                start=mid+1;
            }else if(target>arr[mid]){
                end=mid-1;
            }else if(target==arr[mid]){



                return mid;
            }



        }
        return -1;



    }

}

