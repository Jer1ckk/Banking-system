public class Customer {
    private static int customerCounter = 0;
    int customerId ;
    String name ;
    String address ;
    String phoneNumber ;
    String email ;
    private String password;
    String dateOfBirth ;
    String registrationDate ;

    // Constructor registor 
    public Customer ( String name , String address , String phoneNumber , String email ,String password, String dateOfBirth ) {
        customerId = ++customerCounter ;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    //Constructor login
    public Customer(String name , String password){
        this.name = name ;
        this.password = password;
    }

    // public String getPassword(){
    //     return password ;
    // }

    // public String setPassword(String password) {
    //     return this.password = password ;
    // }
}
