package c_advance_oops.n_encapsulation;
// Here we'll read and write the values
public class EmployeeRW {
    public static void main(String[] args) {
        EmployeeRecord er = new EmployeeRecord();
        System.out.println("Company Code: "+er.getCompanyCode());
        System.out.println("==================================");
        er.setEmployeeId(1001);
        er.setEmployeeName("Satvik Sharma");
        er.setEmployeeSalary(100_000.00f);
        System.out.print("Employee ID: "+er.getEmployeeId()+"\nEmployee Name: "+er.getEmployeeName()+"\nEmployee Salary: $"+er.getEmployeeSalary());
    }
}
