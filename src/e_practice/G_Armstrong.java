package e_practice;

import java.util.Scanner;

public class G_Armstrong {
    public static boolean armstrongNum(int num){
        int sum = 0, orig = num;
        String num2 = String.valueOf(num);
        int length = num2.length();
        // Breakdown the number
        while (num > 0){
            int tempVal = num % 10;
            sum += (int) Math.pow(tempVal, length);
            num/=10;
        }
        return orig == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        System.out.print("Number 1st: ");
        int a = sc.nextInt();
        System.out.print("Number 2nd: ");
        int b = sc.nextInt();
//        int a = 100, b = 200;
        for (int i = a ; i <= b ; i++){
            if (armstrongNum(i))
                System.out.printf(i+" ");
        }
    }
}
