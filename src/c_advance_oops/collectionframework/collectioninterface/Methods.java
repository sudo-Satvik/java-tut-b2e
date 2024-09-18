package c_advance_oops.collectionframework.collectioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Methods {
    public static void main(String[] args) {
        // Since List is an interface, and we know that we can't create the instance of an interface
        // So here, in order to utilise and test all the methods present here, I'm gonna using the ArrayList!

        List<Integer> arr = new ArrayList<>();

//        System.out.println(arr);    // []

//        Method to add elements in the ArrayList
        arr.add(12);
        arr.add(31);
        arr.add(45);
        arr.add(23);
        arr.add(11);
        arr.add(54);

//        System.out.println(arr);    // [12, 31, 45, 23, 11, 54]

//        ========================================================

//        Method to return the size of an array

//        System.out.println(arr.size());         // 6

//        ========================================================

//        Method to return true if array contains no element

//        System.out.println(arr.isEmpty());      // False

//        ========================================================

//        Method to return true if the collection contains the specific element

//        System.out.println(arr.contains(31));       // true
//        System.out.println(arr.contains(32));       // false

//        ========================================================

//        Methods to removes an element

//        arr.remove(4);                    // 11 will be removed because it's on the 4th index
//        System.out.println(arr);          // [12, 31, 45, 23, 54]
        arr.remove(Integer.valueOf(23));  // 23 will be removed
        System.out.println(arr);            // [12, 31, 45, 11, 54]

//        ========================================================

//        Methods which merge the two lists

        List<Integer> arr2 = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        List<Integer> arr3 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr3.add(3);
        arr3.add(5);
        arr3.add(6);
        arr2.addAll(arr3);
//        System.out.println(arr2);
//        arr2.removeAll(arr3);       // [1, 2]
//        System.out.println(arr2);
        arr2.retainAll(arr3);
        System.out.println(arr2);     // [3, 3, 5, 6]
        arr2.addAll(arr2);
//        System.out.println(arr2);
        }
}
