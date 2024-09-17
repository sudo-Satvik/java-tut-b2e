package e_practice;

import java.util.Arrays;

//  https://leetcode.com/problems/two-sum/
public class M_Arr_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j-i] == target) {
                    return new int[] {j, j-i};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
