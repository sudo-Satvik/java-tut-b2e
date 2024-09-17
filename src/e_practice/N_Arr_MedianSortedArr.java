package e_practice;

import java.util.Arrays;

public class N_Arr_MedianSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] nums3 = new int[n1+n2];
        int[] mergedArr = mergeArr(nums1, nums2, n1, n2, nums3);
        if(mergedArr.length % 2 == 0){
            int mid = mergedArr.length / 2;
            return (double) (mergedArr[mid - 1] + mergedArr[mid]) / 2;
        }
        else{
            int mid = mergedArr.length / 2;
            return (double) (mergedArr[mid]);
        }
    }
    public static int[] mergeArr(int[] nums1, int[] nums2, int n1, int n2, int[] nums3){
        int i = 0, j = 0, k = 0;
        while(i < n1) nums3[k++] = nums1[i++];
        while(j < n2) nums3[k++] = nums2[j++];
        Arrays.sort(nums3);
        return nums3;
    }
}
