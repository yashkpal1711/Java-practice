package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s="aOok";
        int m= s.length()/2;
        String s1= s.substring(0,m), s2= s.substring(m,s.length());
        int count1=0, count2=0;
        for (int i = 0; i <s1.length() ; i++) {
            if (s1.charAt(i)=='a' ||s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' ||s1.charAt(i)=='u' ||
                    s1.charAt(i)=='A' ||s1.charAt(i)=='E' ||s1.charAt(i)=='I' ||s1.charAt(i)=='O' ||s1.charAt(i)=='U'){
                count1++;
            }
        }
        for (int i = 0; i <s1.length() ; i++) {
            if (s2.charAt(i)=='a' ||s2.charAt(i)=='e' ||s2.charAt(i)=='i' ||s2.charAt(i)=='o' ||s2.charAt(i)=='u' ||
                    s2.charAt(i)=='A' ||s2.charAt(i)=='E' ||s2.charAt(i)=='I' ||s2.charAt(i)=='O' ||s2.charAt(i)=='U'){
                count2++;
            }
        }
        if (count1==count2){
            return true;
        }
        return false;
    }
}


// new2 +=word2[i];