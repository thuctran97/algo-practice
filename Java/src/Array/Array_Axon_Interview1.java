/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Array;

// Input:
// Cho mot stream integer, tim moving average
// Window size = 3

// MovingAverage ma = MovingAverage(3)
// ma.next(1) -> 1
// ma.next(3) -> (1 + 3) / 2
// ma.next(2) -> (1 + 3 + 2) / 3
// ma.next(5) -> (3 + 2 + 5) / 3


import java.util.LinkedList;
import java.util.List;

class MovingAverage {
    private int windowSize;
    private List<Integer> movingStream;

    public MovingAverage(int windowSize){
        movingStream = new LinkedList<>();
        this.windowSize = windowSize;
    }
    public float next(int input) {
        movingStream.add(input);
        float sum = 0;
        if (movingStream.size() <= this.windowSize){
            for (int value: movingStream) {
                sum+= value;
            }
            return sum/movingStream.size();
        }
        for (int i= movingStream.size() - windowSize; i< movingStream.size(); i++) {
            sum+= movingStream.get(i);
        }
        return sum/windowSize;
    }
}

class Main {
    public static void main(String[] args) {
         MovingAverage ma = new MovingAverage(3);
         System.out.println(ma.next(1));
            System.out.println(ma.next(3));
        System.out.println(ma.next(2));
        System.out.println(ma.next(5));


    }
}

