package e_practice.array;

public class CountDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    count++;
                }
            }
        }
        System.out.println("No. of count: "+count);
    }
}
