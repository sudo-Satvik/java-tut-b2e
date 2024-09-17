package e_practice.loops;

import java.util.Scanner;

// Write a java program to find sum of all odd numbers from 1 to n using for loop.
public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1 ; i <= n; i++){
            if (i % 2 != 0) sum += i;
        }
        System.out.println(sum);
    }
}
