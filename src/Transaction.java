public class Transaction {
    private static int transactionCounter = 0;
    private int transactionID;
    private String transactionType;             //Deposit, Withdrawal, Transfer
    private double amount;
    private String transactionDate;
    private String transactionTime;
    private String transactionDescription;      //remark
    private int accountID;

    public Transaction(String transactionType, double amount, String transactionDate, String transactionTime, String transactionDescription, int accountID) {
        this.transactionID = ++transactionCounter;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.transactionDescription = transactionDescription;
        this.accountID = accountID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
