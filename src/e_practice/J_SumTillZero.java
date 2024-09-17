package e_practice;

import java.util.Scanner;

public class J_SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter the number or press 0 to stop: ");
            int num = sc.nextInt();
            sum += num;
            if (num == 0) break;
        }
        System.out.println("Total sum: "+sum);
    }
}
