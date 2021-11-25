package Array.Aug14;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Array_Find1stAndLastInSortedArray {
    int leftMost = 0;
    int rightMost = 0;
    public void searchLeftMost(int[] nums, int value, int left, int right){
        int middle = (left+right)/2;
        if (nums[middle]==value){

        }
        if (nums[middle]>value){
            searchLeftMost(nums,value, left, middle-1);
        }
        searchLeftMost(nums,value, middle+1, right);
    }
    public static int[] searchRange(int[] nums, int target) {
        return null;
    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        searchRange(nums, 8);
    }
}
