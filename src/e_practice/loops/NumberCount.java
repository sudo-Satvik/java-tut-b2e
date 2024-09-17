package e_practice.loops;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(), count=0;
        while (n != 0){
            n /= 10;
            count+=1;
        }
        System.out.println(count);

        // or we can calculate the number of digits like this
//        Number of digits(num) = (log10(num) + 1)
    }
}
