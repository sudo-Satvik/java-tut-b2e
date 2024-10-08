package a_basic;

import java.util.Arrays;

// Copies field values and creates copies of referenced objects, ensuring the original and copy are fully independent.
public class H_DeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] deepCopy = arr.clone();

        deepCopy[0] = 0;
        System.out.println("Original: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Cloned: ");
        System.out.println(Arrays.toString(deepCopy));
    }
}
