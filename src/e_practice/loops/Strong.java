package e_practice.loops;
import java.util.Scanner;
public class Strong {
    public static boolean strongNum(int n){
        int sum = 0, rem, origNum = n;
        while(n>0){
            rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }
        return sum == origNum;
    }

    public static int factorial(int rem) {
        int fact = 1;
        for (int i = 1; i <= rem ; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit range: ");
        int upperLimit = sc.nextInt();
        for (int i = 1; i <= upperLimit; i++) {
            boolean finalAns = strongNum(i);
            if (finalAns){
                System.out.print(i+", ");
            }
        }
    }
}
