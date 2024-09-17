package e_practice.array;

import java.util.Arrays;

// Write a java program to merge two sorted array to third array.
public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 9, 15};
        int[] arr2 = {2, 5, 8, 10};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] merged = new int[arr2.length+arr1.length];
        int track = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length; i < merged.length ; i++){
            merged[i] = arr2[track];
            track++;
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }
}
