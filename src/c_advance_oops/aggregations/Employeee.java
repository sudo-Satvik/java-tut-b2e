package c_advance_oops.aggregations;

//import static java.lang.StringTemplate.STR;

public class Employeee {
    int employeeId;
    String name;
    Add address;    // Aggregation initiated
    public Employeee(int employeeId, String name, Add address){
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }
    void display(){
//        System.out.println(STR."\{employeeId} \{name}");
//        System.out.println(STR."\{address.address} \{address.city} \{address.state} \{address.country}");
    }

    public static void main(String[] args) {
        Add add1 = new Add("XYZ Street Boulevard", "Queens", "New York City", "USA");
        Add add2 = new Add("G-123 Jeffersons", "Los Angeles", "Southern California", "USA");
        Employeee employee = new Employeee(113201, "S Sharma", add1);
        Employeee employee2 = new Employeee(113202, "M Sharma", add2);
        employee.display();
        employee2.display();
    }
}
