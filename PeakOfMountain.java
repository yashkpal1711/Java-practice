package com.company;

public class PeakOfMountain {
    public static void main(String[] args) {

        int[] MountainArray = {1, 2, 1, 3, 5, 6, 4};
//        [1,2,1,3,5,6,4]
        int target = 3;


        System.out.println(search(MountainArray));

    }

    static int search(int[] arr) {
//        int start= 0;
//        int end= MountainArray.length-1;
//        int peak=0;
//
//
//        while (start<=end){
//            int mid= start + (end-start)/2;
//
//            if(MountainArray[mid+1]<MountainArray[mid]){
//                if(MountainArray[mid]>MountainArray[mid-1]){
//                    peak= mid;
//                    break;
//                }
//                else{
//                    end=mid-1;
//                }
//            }else if(MountainArray[mid+1]>MountainArray[mid]){
//                start=mid+1;
//            }
//
//        }
//
//        start=0;
//        end= peak;
//
//        while (start<=end){
//            int mid= start + (end-start)/2;
//
//            if(target<MountainArray[mid]){
//                end=mid-1;
//            }else if(target>MountainArray[mid]){
//                start=mid+1;
//            }else if(target==MountainArray[mid]){
//
//
//
//                return mid;
//            }
//
//
//
//        }
//
//        start=peak+1;
//        end = MountainArray.length-1;
//
//        while (start<=end){
//            int mid= start + (end-start)/2;
//
//            if(target<MountainArray[mid]){
//                end=mid-1;
//            }else if(target>MountainArray[mid]){
//                start=mid+1;
//            }else if(target==MountainArray[mid]){
//
//
//
//                return mid;
//            }
//
//
//
//        }
//        return -1;

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

        return start;

        }

}
