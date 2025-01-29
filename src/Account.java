public class Account {
    private static int accountCounter = 0;
    private int accountID;
    private String accountType;     //saving or checking
    private double balance;
    private String currencyType;
    private String dateCreated;
    private String status;          //active or inactive
    private int customerID;

    public Account(String accountType, double balance, String currencyType, String dateCreated, String status, int customerID) {
        this.accountID = ++accountCounter;
        this.accountType = accountType;
        this.balance = balance;
        this.currencyType = currencyType;
        this.dateCreated = dateCreated;
        this.status = status;
        this.customerID = customerID;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
