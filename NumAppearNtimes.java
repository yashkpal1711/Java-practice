package com.company;

import java.util.Arrays;

public class NumAppearNtimes {
    public static void main(String[] args) {
        // all the number appear n times rather than a specific number find the number
        int arr[] = {2, 2,11, 2, 7, 7, 8, 7, 8, 8};
        int n =3;
        int sum = Arrays.stream(arr).sum();
        int ans = sum % n;
        System.out.println(ans);
    }
}
