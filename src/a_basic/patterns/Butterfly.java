package a_basic.patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
//        Upper Half
        for (int i = 0; i < n; i++) {
            // First feather - Upper Half
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // First space
            for (int j = 0; j < 2 * (n - i) - 2; j++) {
                System.out.print("  ");
            }
            // Second feather - Upper Half
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
//        Lower half
        for (int i = n; i > 0; i--) {
            // First feather - Lower Half
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            // Second space
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Second Feather - Lower Half
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
