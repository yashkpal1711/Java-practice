package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code

        Scanner in = new Scanner(System.in);
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//


//        for(int a: arr){
//            arr[a]= in.nextInt();
//        }

//        for(int a: arr){
//            System.out.println(a);
//        }
////        System.out.println(Arrays.toString(arr));

        // add edit remove and print numbers from Dynamic array or array list

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        list.set(2, 45);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        Boolean[] dhdh= new  Boolean[5];
    }
}