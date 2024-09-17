package e_practice.array;

import java.util.Arrays;

// Write a java program to find second largest element in an array. If not exist, then return -1.
public class Second {
    public static int secondMax(int[] nums){
        Arrays.sort(nums);
        int arrLength = nums.length;
        return nums[arrLength - 2];
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 8, 6, 6, 75, 38, 3, 2};
        System.out.println(secondMax(arr));
    }
}
