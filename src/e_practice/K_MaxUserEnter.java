package e_practice;

import java.util.Scanner;

public class K_MaxUserEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, num;
        while (true){
            System.out.println("Enter the values, or press 0 to stop: ");
            num = sc.nextInt();
            if (num == 0) break;
            else if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The values you entered among which the largest one is: " + largest);
    }
}
