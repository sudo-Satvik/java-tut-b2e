package e_practice.array;

public class Search {
    public static int search(int[] arr, int target){
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 20, 25, 13, 10, 9, 40, 60, 5};
        System.out.println(search(arr, 10));
    }
}
