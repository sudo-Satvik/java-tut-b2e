package a_basic.patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 4;

        // Top Part
        for (int i = 0; i < n; i++) {
            // First spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 0) {
                // Inner space
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom Part
        for (int i = 1; i < n; i++) {
            // First spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // Inner space
            if (i != n - 1) {
                for (int j = 0; j < 2 * (n - i) - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
