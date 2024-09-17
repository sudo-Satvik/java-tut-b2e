package e_practice.array;

import java.util.Arrays;
import java.util.Scanner;

// Write a java program to insert an element in an array
public class Insert {
    public static void insert(int[] arr, int p, int ins){
        // n+1 since one element will be added
        int track = 0;
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < p; i++) {
            newArr[i] = arr[track];
            track++;
        }
        newArr[p] = ins;
        for (int i = p+1 ; i <= arr.length ; i++){
            newArr[i] = arr[track];
            track++;
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Which position would you like to insert: ");
        int position = sc.nextInt();
        System.out.println("What you want to insert: ");
        int insert = sc.nextInt();
        insert(arr, position, insert);
    }
}
