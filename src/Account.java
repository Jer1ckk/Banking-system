public class Account {
    private static int accountCounter = 0;
    private int accountID;
    private String accountType;     //saving or checking
    private double balance;
    String currencyType;
    String dateCreated;
    String status;          //active or inactive
    int customerID;

    public Account(String accountType, double balance, String currencyType, String dateCreated, String status, int customerID) {
        this.accountID = ++accountCounter; // this keyword mean current obj /obj level
        this.accountType = accountType;
        this.balance = balance;
        this.currencyType = currencyType;
        this.dateCreated = dateCreated;
        this.status = status;
        this.customerID = customerID;
    }

    // public double getBalance () {
    //     return balance ;
    // }
    
    // public void setBalance(double balance){
    //     this.balance = balance;
    // }
}
