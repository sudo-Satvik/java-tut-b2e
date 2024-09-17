package basic_oops;

//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods
class Account{
    int accNo;
    String name;
    float amount;
    // Method to initialize object
    void insert(int accNo, String name, float amount){
        this.accNo = accNo;
        this.name = name;
        this.amount = amount;
    }
    // Deposit method
    void deposit(float amt){
        amount += amt;
        System.out.println(amt+" deposited!");
    }
    // Withdraw method
    void withdraw(float amt){
        if(amount < amt) System.out.println("Insufficient balance");
        else {
            amount -= amt;
            System.out.println(amt+" withdrawn!");
        }
    }
    // Method to check balance
    void checkBalance(){
        System.out.println(amount);
    }
    // Method to display values of an object
    void display(){
        System.out.println(accNo+" "+name+" "+amount);
    }
}
public class S_Banking {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
