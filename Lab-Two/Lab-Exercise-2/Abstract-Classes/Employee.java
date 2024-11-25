public class Employee extends Person {
    private int employeeId;
    
    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.employeeId = id;
    }
    
    // Constructor with no employee ID (default to 0)
    public Employee(String nm, String gen) {
        super(nm, gen);
        this.employeeId = 0;
    }
    
    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }
    
    public String toString() {
        return "Name: " +getName() +", Gender: "+getGender() + ", Employee ID: " +employeeId;
    }
}