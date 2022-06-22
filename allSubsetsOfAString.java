package com.company;

public class allSubsetsOfAString {
    public static void main(String[] args) {
            subsets("aaa");
    }

    static void subsets( String s){
            utilSubsets(s,0,"");
    }

    static  void utilSubsets(String s, int i, String curr){

        if (i== s.length()){
            System.out.println(curr);
            return;
        }

        utilSubsets(s,i+1,curr);
        utilSubsets(s,i+1,curr+s.charAt(i));
    }
}
