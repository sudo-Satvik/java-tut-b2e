package c_advance_oops;

import java.util.Scanner;

public class M_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age-");
        int age = sc.nextInt();
        try{
            if (age > 100){
                throw new MyOwnException("My custom exception!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class MyOwnException extends Exception{
    MyOwnException(String message){
        super(message);
    }
}
