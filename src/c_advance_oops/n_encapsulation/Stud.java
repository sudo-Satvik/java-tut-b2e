package c_advance_oops.n_encapsulation;
// This is the fully encapsulated class!
public class Stud {
    // Private data member
    // Another class of same package can't access it!
    private String name;
    // Getter - Read-Only
    public String getName(){
        return name;
    }
    // Setter - Write-Only
    public void setName(String name){
        this.name = name;
    }
}
