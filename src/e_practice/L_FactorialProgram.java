package e_practice;

import java.util.Scanner;

//Factorial Program In Java
public class L_FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt(), factorial = 1;
        for (int i = num ; i > 0 ; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
