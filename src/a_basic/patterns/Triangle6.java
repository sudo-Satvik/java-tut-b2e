package a_basic.patterns;

import java.util.Scanner;

//Floyd's Triangle
/*
* That's how Floyd's Triangle looks like:
* 1
* 2 3
* 4 5 6
* 7 8 9 10
*
* */
public class Triangle6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        int n = sc.nextInt(), num = 1;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
