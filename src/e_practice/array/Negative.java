package e_practice.array;

import java.util.Arrays;

public class Negative {
    public static void main(String[] args) {
        int[] num = {1,2,3,-3, -34};
        negativeArr(num);
    }
    public static void negativeArr(int[] arr){
        int[] tempArr = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                System.out.print(arr[i]+", ");
            }
        }
    }
}
