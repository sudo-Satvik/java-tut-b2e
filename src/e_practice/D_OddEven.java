package e_practice;

import java.util.Scanner;

public class D_OddEven {
    public static void oddEven(int num){
        if (num%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out whether it's odd or even: ");
        int num = sc.nextInt();
        oddEven(num);
    }
}
