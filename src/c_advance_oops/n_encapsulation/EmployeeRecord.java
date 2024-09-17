package c_advance_oops.n_encapsulation;
// This is the fully encapsulated class
public class EmployeeRecord {
    private final short companyCode = 154;
    private int employeeId;
    private String employeeName;
    private float employeeSalary;
    // Getter Method
    public short getCompanyCode(){
        return companyCode;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public float getEmployeeSalary(){
        return employeeSalary;
    }
    // Setter Method
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
