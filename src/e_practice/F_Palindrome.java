package e_practice;

public class F_Palindrome {
    public static void main(String[] args) {
        System.out.println(numPalindrome(12321));
    }
    static boolean numPalindrome(int num){
        int temp = num, sum = 0;
        while (num != 0){
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        if (temp == sum) return true;
        return false;
    }
}
