package e_practice;

import java.util.Scanner;

public class I_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find out the factors: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) System.out.print(i+" ");
        }
    }
}
