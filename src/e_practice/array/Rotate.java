package e_practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] rotatedArr = new int[n];
        int tempIndex = 0;
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        for (int i = k ; i < arr.length; i++){
            rotatedArr[tempIndex] = arr[i];     // Gadbad       k instead of i
            tempIndex++;
        }
//        Yaha gaand fatt rhi bc
        for(int i = 0 ; i < k ; i++){
            rotatedArr[tempIndex] = arr[i];
            tempIndex++;
        }
        System.out.println(Arrays.toString(rotatedArr));
    }
}
