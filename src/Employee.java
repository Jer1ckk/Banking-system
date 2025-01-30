public class Employee {
    private static int employeeCounter = 0;
    int employeeID;
    String firstName, lastName;
    String position;
    private double salary;
    String hireDate;
    String email;
    String password;
    String phoneNumber;
    int branchID;

    public Employee(String firstName, String lastName, String position, double salary, String hireDate, String email, String phoneNumber, int branchID) {
        this.employeeID = ++employeeCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.branchID = branchID;
    }
    
    // Constructor login
    public Employee(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


}
