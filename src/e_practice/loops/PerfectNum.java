package e_practice.loops;

import java.util.Scanner;

//Write a java program to find all Perfect numbers in a given range.
public class PerfectNum {
    public static void main(String[] args) {
        int a = 1;
        int b = 10000;
        // first finding the factors
        for (int i = a+1 ; i <= b ; i++){
            int sum = 0;
            for (int j = 1 ; j < i ; j++){
                if (i % j == 0) sum += j;
            }
            // Checking the number is a perfect number
            if (sum == i){
                System.out.print(sum+", ");
            }
        }
    }
}
