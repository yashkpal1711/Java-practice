package com.company;

public class Bitwise {
    public static class ResetBit {
        public static void main(String[] args) {
            int n=123; //1111011
            int i=4;

            System.out.println((n&(~(1<<i-1))));
        }
    }

    public static class RightMostSetBit {
        public static void main(String[] args) {
            int n =120; //1111000

            int rmsb =  ((n &-n));
            System.out.println(Integer.toBinaryString(rmsb));
        }
    }
}
