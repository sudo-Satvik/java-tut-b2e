package e_practice.if_else;

import java.util.Scanner;

public class B_CharChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any char: ");
        char ch = sc.nextLine().charAt(0);
        if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')){
            System.out.println("Letter");
        } else if (ch > '0' && ch < '9') {
            System.out.println("Number");
        }else {
            System.out.println("Special Character");
        }
    }
}
