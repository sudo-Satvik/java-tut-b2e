package basic_oops;

public class X_Setter {
    int roll = 10020;
    public void setRoll(int roll)
    {
        this.roll = roll;
        System.out.println(roll);
    }

    public static void main(String[] args) {
        X_Setter xs = new X_Setter();
        xs.setRoll(1000);
    }
}
