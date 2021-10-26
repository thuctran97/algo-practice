/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Array;

public class Array_Axon_AlgoTest2 {
    public static long[] solution(double[] prices) {
        double totalPrice = 0;
        long totalAdjustPrice = 0;

        long[] adJustedprices = new long[prices.length];
        int i=0;
        for (double price: prices){
            adJustedprices[i++] = Math.round(price);
            totalPrice += price;
            totalAdjustPrice+= Math.round(price);
        }

        return adJustedprices;
    }
    public static void main(String[] args) {
        double[] prices = {5.4, 3.3, 5};
        int n = prices.length;
        System.out.println(n);
        long[] nguyen = new long[n];
        double[] le = new double[n];
        int[] index = new int[n];
        int i=0;
        double sumLe = 0;
        for (double pt: prices){
            index[i] = i;
            le[i] = prices[i]- Math.round(prices[i]);
            nguyen[i] = Math.round(prices[i]);
            sumLe += le[i];
            i++;
        }
        long sumChan = Math.round(sumLe);

        for (i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (le[index[i]] < le[index[j]]){
                    int tmp = index[i];
                    index[i]= index[j];
                    index[j] = tmp;
                }
            }
        }
        for (i=0; i<n; i++) {
            if (sumChan>0){
                nguyen[index[i]]+= 1;
                sumChan--;
            }
        }
        for (i=0; i<n; i++) {
            System.out.println(nguyen[i]);
        }
    }
}
