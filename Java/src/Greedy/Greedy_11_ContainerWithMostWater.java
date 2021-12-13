package Greedy;

public class Greedy_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int result = 0;
        while (leftIndex != rightIndex){
            result = Math.max(result, Math.min(height[leftIndex], height[rightIndex])*(rightIndex-leftIndex));
            if (height[leftIndex] <= height[rightIndex]){
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return result;
    }
}
