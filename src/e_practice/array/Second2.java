package e_practice.array;
import java.util.Scanner;

public class Second2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(STR."Enter \{i}th element: ");
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("-1");
        }
        else System.out.println(secondLargest);
    }
}
