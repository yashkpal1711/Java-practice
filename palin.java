package com.company;

import java.util.Locale;

public class palin {
    public static void main(String[] args) {
        String str= "abcdcbaaa";
        System.out.println(ispalin(str));
        System.out.println(str.charAt(str.length()-1));
    }

    static boolean ispalin( String str){
        str= str.toLowerCase(Locale.ROOT);
        int s= 0;
        int e= str.length()-1;
        while (e>=s){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }else {
                return false;
            }

        }
        return true;
    }
}
