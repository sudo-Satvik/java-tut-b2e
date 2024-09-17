package e_practice.if_else;

public class A_MaxAmongThree {
    private static int max(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else if (c > b && c > a)
            max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 25, 30));
    }
}
