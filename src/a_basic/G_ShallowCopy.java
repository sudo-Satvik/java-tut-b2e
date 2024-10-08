package a_basic;
import java.util.Arrays;
/*
*  Copies field values as-is, meaning objects referenced are shared between the original and the copy.
* */
public class G_ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] shallowCopy = arr;
        shallowCopy[0] = 0;
        System.out.println("Original: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Cloned: ");
        System.out.println(Arrays.toString(shallowCopy));
    }
}
