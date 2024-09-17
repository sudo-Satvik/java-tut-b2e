package a_basic;

import java.util.Scanner;

public class B_Input {
    public static void main(String[] args) {
        // In order to take input we have to Initialize the Scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
