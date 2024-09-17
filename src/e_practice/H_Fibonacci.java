package e_practice;

import java.util.Scanner;

public class H_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term up to which you will find out the Fibonacci Series: ");
        int num = sc.nextInt(), firstTerm = 0, secondTerm = 1;
        if (num<=0){
            System.out.println("Enter the positive number only!");
        } else if (num==1) {
            System.out.println(firstTerm);
        } else if (num==2) {
            System.out.println(secondTerm);
        }else {
            System.out.print(firstTerm+", "+secondTerm);
            for (int i = 3; i <= num; i++) {
                // I lagged here so that's why I am rewriting this code
                int nextTerm = firstTerm + secondTerm;
                System.out.print(", "+nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}
