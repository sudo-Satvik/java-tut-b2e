package a_basic.patterns;

/*
1111
 222
  33
   4
*/
public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0 ; i < n ; i++){
//            Loop for white spaces
            for (int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
//            For number entering
            for (int j = 1; j <= n-i; j++) {
                System.out.print(i+1);
            }
            System.out.println(" ");
        }
    }
}
