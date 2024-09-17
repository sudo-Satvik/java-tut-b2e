package basic_oops;
class StudentRecord{
    int rollno, classname;
    String name, course;
    float fees;
    StudentRecord(int rollno, int classname, String name){
        this.rollno = rollno;
        this.classname = classname;
        this.name = name;
    }
    StudentRecord(int rollno, int classname, String name, String course, float fees){
        this(rollno, classname, name);      // Constructor Reusability ~ This must be above all the time otherwise Compile Time Error
        this.course = course;
        this.fees = fees;
    }
    void displayResult(){
        System.out.println(rollno+" "+name+" "+classname+" "+course+" "+fees);
    }
}
public class O_ConstructorCall {
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord(12, 10, "Satvik");
        sr.displayResult();
        StudentRecord sr2 = new StudentRecord(12,10,"Satvik","PCM",10000.50f);
        sr2.displayResult();
    }
}
