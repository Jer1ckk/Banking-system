public class Transaction {
    private static int transactionCounter = 0;
    int transactionID;
    String transactionType;             //Deposit, Withdrawal, Transfer
    double amount;
    String transactionDate;
    String transactionTime;
    String transactionDescription;      //remark
    int accountID;

    public Transaction(String transactionType, double amount, String transactionDate, String transactionTime, String transactionDescription, int accountID) {
        this.transactionID = ++transactionCounter;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.transactionDescription = transactionDescription;
        this.accountID = accountID;
    }
}
