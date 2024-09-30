package a_basic.patterns;

public class PyramidTriangle {
    public static void main(String[] args) {
//        Pyramid triangle or Pascal Triangle
        int n = 4;
        for(int i = 1 ; i <= n ; i++){
//          White Space Region
            for (int j = i ; j < n ; j++){
                System.out.print(" ");
            }
//            Left area of Triangle
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
//            Right area of Triangle
            for (int j = i - 1 ; j > 0 ; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
