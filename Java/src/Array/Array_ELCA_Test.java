package Array;

import java.util.*;
import java.io.*;

public class Array_ELCA_Test {

    public static int calculateTotalPrice(int[] prices, int discount) {
    	int totalPrice = 0;
    	int maxPrice = 0;
        for (int i=0; i< prices.length; i++) {
        	totalPrice += prices[i];
        	if (prices[i]>maxPrice) {
        		maxPrice = prices[i];
        	}
        }
//        System.out.println("totalPrice: "+ totalPrice);
//        System.out.println("maxPrice: "+maxPrice);

        double result = totalPrice-maxPrice+maxPrice*discount/100.0;
//        System.out.println("result2: "+Math.floor(result));
        return (int)Math.floor(result);

    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int discount = in.nextInt();
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount);
        System.setOut(outStream);
        System.out.println(price);
    }
}