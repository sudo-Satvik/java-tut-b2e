package c_advance_oops.collectionframework.collectioninterface;

// There are three ways we can iterate the List (for eg in ArrayList)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Supra");
        cars.add("Ferrari");
        cars.add("Lamborghini");
        cars.add("RangeRover");

//        Way 1 to iterate
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("The car name is: "+cars.get(i));
        }
        System.out.println("===================================");
//        Way 2 to iterate
        for(String car : cars){
            System.out.println("For each car: "+car);
        }
        System.out.println("===================================");
//        Way 3 to iterate
        Iterator<String> car = cars.iterator();         // .iterator() coming from collection whereas .listIterator(index) came from List
        while (car.hasNext()){
            System.out.println("By using iterator: "+car.next());
        }
        System.out.println("===================================");
        System.out.println(cars);
        System.out.println("===================================");
        List<String> smallList = cars.subList(1, 3);
        System.out.println(smallList);
    }
}
