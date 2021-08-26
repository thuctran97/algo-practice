/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Backtracking_DayCon {
    public static int result[];
    public static int trace[];

    public static void main(String[] args) {
        int[] a = { 6, 4, 3, 2, 5 };
        int n= 5;
        result = new int[n];
        trace = new int[n];

        for (int i=1; i<= n; i++){
            sinh(a, 0, i, n);
        }
    }

    private static void sinh(int[] a, int i, int sl, int n) {
        if (i== sl){
            for (int x=0; x< sl; x++){
                System.out.print(a[result[x]]);
            }
            System.out.println();
            return;
        } else {
            for (int j=i; j<n; j++){
                if (trace[j]==0){
                    //                System.out.println(j);
                    trace[j]=1;
                    result[i] = j;
                    sinh(a, i+1, sl, n);
                    trace[j]=0;
                }
            }
        }
    }
}
