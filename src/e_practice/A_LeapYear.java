package e_practice;

import java.util.Scanner;

// Input a year and find whether it is a leap year or not.
public class A_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year which you want to find out whether it's a leap or not");
        int year = sc.nextInt();
        System.out.println(year % 4 == 0?"Leap year":"Non-Leap Year");
    }
}
