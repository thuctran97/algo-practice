/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Backtracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Backtracking_Rating {
    public static int result[];
    public static int trace[];

    public static void main(String[] args) {
        int[] a = { 2,5,3,4,1 };
        int n= 5;
        result = new int[n];
        trace = new int[n];
        sinh(a, 0);
    }

    private static void sinh(int[] a, int i) {
        if (i==3){
            int ri = a[result[0]];
            int rj = a[result[1]];
            int rk = a[result[2]];
            if ((ri<rj && rj < rk) || (ri>rj && rj>rk))
            {
                System.out.println(ri+" "+rj+" "+rk);
            }
            return;
        } else {
            int j = i==0?0:result[i-1]+1;
            for (; j<a.length; j++){
                if (trace[j]==0){
                    trace[j]=1;
                    result[i] = j;
                    sinh(a, i+1);
                    trace[j]=0;
                }
            }
        }
    }
}
