public class Loan {
    private static int loanCounter = 0;
    private int loanID;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private String loanStartDate;
    private String loanEndDate;
    private String loanStatus;
    private double monthlyInstallmentAmount;
    private int customerID;

    public Loan(String loanType, double loanAmount, double interestRate, String loanStartDate, String loanEndDate, String loanStatus, double monthlyInstallmentAmount, int customerID) {
        this.loanID = ++loanCounter;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanStartDate = loanStartDate;
        this.loanEndDate = loanEndDate;
        this.loanStatus = loanStatus;
        this.monthlyInstallmentAmount = monthlyInstallmentAmount;
        this.customerID = customerID;
    }

    public int getLoanID() {
        return loanID;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getLoanStartDate() {
        return loanStartDate;
    }

    public String getLoanEndDate() {
        return loanEndDate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public double getMonthlyInstallmentAmount() {
        return monthlyInstallmentAmount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

}
