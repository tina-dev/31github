package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class StockChallenge {
    public static void main(String [] args) {
        int [] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));

    }

    public static int maxProfit(int [] prices) {
        List<Integer> list = new ArrayList<>();
        int largest = 0; // Initialize largest profit to 0

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int maxProf = prices[j] - prices[i];
                list.add(maxProf); // Add profit to the list

                // Check if this profit is the largest so far
                if(maxProf > largest) {
                    largest = maxProf;

                }
            }

        }
        if(largest > 0) {
            return largest;
        }
        return 0;
    }
}
