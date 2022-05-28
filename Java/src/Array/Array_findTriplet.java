package Array;

import java.util.Arrays;
// Java program to find a triplet
public class Array_findTriplet {

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    static boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l,r;
        Arrays.sort(A);
        for (int i = 0; i < arr_size - 2; i++) {

            // To find the other two elements, start two
            // index variables from two corners of the array
            // and move them toward each other
            l = i + 1; // index of the first element in the
            // remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        find3Numbers(A, arr_size, sum);
    }
}