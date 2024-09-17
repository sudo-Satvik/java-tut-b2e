package e_practice;

import java.util.Scanner;

public class B_HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int lcm = a * b / hcf(a,b);
        System.out.println("HCF is: "+hcf(a, b)+"\n"+"LCM is: "+lcm);
    }
    public static int hcf(int a, int b){
        while(a != 0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
