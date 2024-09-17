package e_practice;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class C_UnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
//        String input = sc.nextLine();
        while (true){
            System.out.println("Enter the number or press x to stop: ");
            String input = sc.nextLine();
            if (input.equals("x")) break;
            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
