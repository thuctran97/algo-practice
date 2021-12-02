/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Array;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class Result2 {

    /*
     * Complete the 'waitingTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY tickets
     *  2. INTEGER p
     */

    public static long waitingTime(List<Integer> tickets, int p) {
        int waitingTime = tickets.get(p);
        int jessTime = waitingTime;
        for (int i = 0; i < tickets.size(); i++) {
            if (i< p) {
                waitingTime += (Math.min(jessTime, tickets.get(i)));
            } else
                if (i > p) {
                    if (jessTime <= tickets.get(i)){
                        waitingTime += jessTime - 1;
                    } else {
                        waitingTime += tickets.get(i);
                    }
                }
        }

        return waitingTime;
    }

}

class Solution_Tiki {
    public static void main(String[] args) throws IOException {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(3);
        l.add(2);
        l.add(4);
        System.out.println("result: "+ Result2.waitingTime(l,2));
    }
}
