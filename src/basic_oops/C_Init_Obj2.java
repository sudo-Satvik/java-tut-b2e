package basic_oops;
class Students{
    int rollNo;
    String name;
    void insertRecord(int r, String n){             // Value Entering method
        rollNo = r;
        name = n;
    }
    void displayInformation(){                      // Value Displaying method
        System.out.println(rollNo+" "+name);
    }
}
public class C_Init_Obj2 {
    public static void main(String[] args) {
        Students s1 = new Students();                // Object creation
        s1.insertRecord(1207, "Satvik");       // Entering the value from here
        s1.displayInformation();                     // Displaying the value via here
    }
}
