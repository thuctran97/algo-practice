// https://leetcode.com/problems/single-element-in-a-sorted-array/solution/
class Solution {
    public int checkPos(int[] a, int limit, int pos){
        if (pos + 1 < limit && a[pos] == a[pos+1]){
            return 1;
        }
        if (pos-1 >= 0 && a[pos] == a[pos-1]){
            return -1;
        }
        return 0;
    }
    public int findResult(int[] a, int begin, int end){
        int middle = (begin + end)/2;
        int posCheck = checkPos(a, a.length, middle);
        int total = middle - begin +1; 
        if (posCheck == 0) {
            return a[middle];
        }
        
        if ((total%2 ==1 && posCheck == -1) || (total%2 ==0 && posCheck == 1)){
            if (total == 1 && checkPos(a, a.length, middle+1) ==0){
                return a[a.length-1];     
            }
            return findResult(a, begin, middle);
        } else {
            return findResult(a, middle, end);
        }
        
    }
    public int singleNonDuplicate(int[] nums) {
        return findResult(nums, 0, nums.length-1);
    }
}