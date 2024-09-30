package a_basic.patterns;

import java.util.Scanner;

public class Square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int n = sc.nextInt(), num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
