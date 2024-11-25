public class EmployeeTest {
public static void main(String[] args) {
    // Create Employee object using constructor with ID
    Employee e1 = new Employee("Allia", "Female", 34526);
    
    // Create Employee object using constructor without ID
    Employee e2 = new Employee("Patrick", "Mala");
    
    // Print details of both employees
    System.out.println(e1.toString());
    System.out.println(e2.toString());
    
    System.out.println("Employee 1 ID: " + e1.getEmployeeId());
    System.out.println("Employee 2 ID: " + e2.getEmployeeId());
}
}