package a_basic.patterns;

import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square made up of asterisks: ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch += 1;
            }
            ch = 'A';
            System.out.println(" ");
        }
    }
}
