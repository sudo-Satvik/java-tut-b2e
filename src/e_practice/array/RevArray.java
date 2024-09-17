package e_practice.array;

import java.util.Arrays;

//  Write a java program to print the reverse of array.
public class RevArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 16, 35, 500};
        int arrLen = 0;
        int[] revArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            revArr[i] = arr[arrLen];
            arrLen++;
        }
        System.out.println(Arrays.toString(revArr));
    }
}
