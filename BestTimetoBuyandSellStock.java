package com.company;

// using kadane's algorithm for Best time to buy and sell
// using local maxima to sell and local minima to buy

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
            int[] a= {7,1,5,3,6,4};
        System.out.println(bestTimetoBuyandSellStock(a));
    }
    static int bestTimetoBuyandSellStock(int[] a){
        int allpositive=0, max=0;
        for (int i = 1; i <a.length ; i++) {
            allpositive += a[i]-a[i-1];
            allpositive = Math.max(0,allpositive);

            if (allpositive>max) max=allpositive;
        }
        return max;
    }
    static public int maxProfit(int[] prices) {
        int i=0,j=0,count=0;
        if(prices.length==1){
            return 0;
        }

        for(int a=0;a<prices.length;a++){
            if(a==0){
                if(prices[a+1]> prices[a]){
                    i=prices[a];
                }
            }else
            if(a==prices.length-1){
                if(prices[a]> prices[a-1]){
                    j=prices[a];
                    count +=j-i;
                }
            }else
            if(prices[a]<= prices[a-1] && prices[a+1] > prices[a]){
                i=prices[a];
            }else
            if(prices[a]> prices[a-1] && prices[a+1]<= prices[a]){
                j=prices[a];
                count +=j-i;
            }
        }

        return count;
    }
}
