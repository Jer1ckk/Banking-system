public class Employee {
    private static int employeeCounter = 0;
    private int employeeID;
    private String firstName, lastName;
    private String position;
    private double salary;
    private String hireDate;
    private String email;
    private String phoneNumber;
    private int branchID;

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
    
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }
}
