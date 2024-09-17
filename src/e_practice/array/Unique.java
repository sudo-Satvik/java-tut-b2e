package e_practice.array;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
