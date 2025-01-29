public class Customer {
    private static int customerCounter = 0;
    private int customerId ;
    private String name ;
    private String address ;
    private String phoneNumber ;
    private String email ;
    private String dateOfBirth ;
    private String registrationDate ;

    public Customer ( String name , String address , String phoneNumber , String email , String dateOfBirth ) {
        customerId = ++customerCounter ;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return customerId;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
