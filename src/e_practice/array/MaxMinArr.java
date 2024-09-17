package e_practice.array;
// Write a java program to find maximum and minimum element in array.
public class MaxMinArr {
    public static void main(String[] args) {
        int[] arr = {10, 50, 12, 16, 2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
//        System.out.println(STR."Min value: \{min} \nMax Value: \{max}");
    }
}
