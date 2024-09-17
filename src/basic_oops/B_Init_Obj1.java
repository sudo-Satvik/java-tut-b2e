package basic_oops;
// By reference variable
class Student{
    int id;
    String name;
}
public class B_Init_Obj1 {
    public static void main(String[] args) {
        Student s1 = new Student();     // An object
        s1.id = 101;         // Initiating with reference variable
        s1.name = "Satvik";  // Initiating with reference variable
        System.out.println(s1.id+"\n"+s1.name);
    }
}
