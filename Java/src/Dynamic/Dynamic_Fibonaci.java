/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Dynamic;

class Array_540_SingleElementInSortedArray {
    public static int[] arr;
    public static int FBNC(int n){
        if (n<= 1){
            arr[n] = n;
        } else {
            arr[n] = FBNC(n-1) + FBNC(n-2);
        }
        return arr[n];
    }
    public static void main(String args[]) {
        int n= 5;
        arr = new int[n+1];
        System.out.println(FBNC(n));
    }
}
