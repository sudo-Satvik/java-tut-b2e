package d_collection_frameworks;
import java.util.ArrayList;
import java.util.Arrays;

// Resizable-array implementation of the List interface.
public class A_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hii");           // appends the element to the end of the list [returns: boolean]
        arrayList.add("Hello");           // appends the element to the end of the list [returns: boolean]
        arrayList.add("Meow");           // appends the element to the end of the list [returns: boolean]
        arrayList.add("Huihuihui");           // appends the element to the end of the list [returns: boolean]
        arrayList.add(3, "Before Huihuihui"); // Insert the element at given position (0-n-1) [returns: void]
//        arrayList.clear();                                  // Remove all the element from the list [returns: void]
        arrayList.remove("Hii");            // remove the first occurrence of the particular element [return: boolean]
        arrayList.remove(0);             // remove the element at given index [return: String]
        Object[] arr = arrayList.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);
    }
}
