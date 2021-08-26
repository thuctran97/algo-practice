/**
 * Copyright (c) 2021 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package Graph;

import java.util.Scanner;

class Node {
    long key;
    Node left, right;
    public Node (long value){
        this.key = value;
        this.left = this.right = null;
    }
}
class BinaryTree {
    Node root;
    public long sumLeft;
    public long sumRight;

    public BinaryTree(long key) {
        root = new Node(key);
    }
    public BinaryTree() {
        root = null;
    }

    private Node addRecursive(Node current, long value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.key) {
            sumLeft+= value;
            current.left = addRecursive(current.left, value);
        } else if (value > current.key) {
            sumRight += value;
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }
    public void add(long key) {
        root = addRecursive(root, key);
    }
}
class Solution {
    public static String solution(long[] arr) {
        BinaryTree bt = new BinaryTree();
        if (arr.length == 0 ){
            return "";
        }
        for (long key: arr
             ) {
            bt.add(key);
        }
        if (bt.sumLeft > bt.sumRight) {
            return "Left";
        }
        if (bt.sumLeft < bt.sumRight) {
            return "Right";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        System.out.print(solution(a));
    }

}
