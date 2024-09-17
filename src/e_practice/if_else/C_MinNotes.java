package e_practice.if_else;

import java.util.Scanner;

//Write a Java program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
public class C_MinNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount ");
        int amt = sc.nextInt();
        int num500 = 0, num100 = 0, num50 = 0, num20 = 0, num10 = 0, num5 = 0, num2 = 0, num1 = 0;
        if(amt >= 500){
            num500 = amt / 500;     // Notes length
            amt %= 500;        // Rupees Left
        }
        if(amt >= 100){
            num100 = amt / 100;
            amt %= 100;
        }
        if(amt >= 50){
            num50 = amt / 50;
            amt %= 50;
        }
        if(amt >= 20){
            num20 = amt / 20;
            amt %= 20;
        }
        if(amt >= 10){
            num10 = amt / 10;
            amt %= 10;
        }
        if(amt >= 5){
            num5 = amt / 5;
            amt %= 5;
        }
        if(amt >= 2){
            num2 = amt / 2;
            amt %= 2;
        }
        if(amt >= 1){
            num1 = amt / 1;
            amt %= 1;
        }
        System.out.println("Total Number of Notes");
        System.out.println("500 = " + num500);
        System.out.println("100 = " + num100);
        System.out.println("50 = " + num50);
        System.out.println("20 = " + num20);
        System.out.println("10 = " + num10);
        System.out.println("5 = " + num5);
        System.out.println("2 = " + num2);
        System.out.println("1 = " + num1);
    }
}
