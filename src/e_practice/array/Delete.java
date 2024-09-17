package e_practice.array;
// Write a java program to delete element from array at specified position.
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        // Input size and elements in array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = scanner.nextInt();

        //Creating the array
        int[] arr = new int[size];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element position to delete
        System.out.println("Enter the element position to delete: ");
        int pos = scanner.nextInt();

        // Check for invalid delete position
        if (pos <= 0 || pos > size) {
            System.out.printf("Invalid position! Please enter position between 1 to %d", size);
        } else {
            // Copy next element value to current element
            for (int i = pos - 1; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Decrement array size by 1
            size--;

            // Print array after deletion
            System.out.print("\nElements of array after delete are: ");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d\t", arr[i]);
            }
        }

        scanner.close();
    }
}
