public class Branch {
    private static int branchCounter = 0;
    int branchID;
    String branchName;
    String location;
    String phoneNumber;
    String managerName;
    String openingHours;
    String establishedDate;

    public Branch(String branchName, String location, String phoneNumber, String managerName, String openingHours, String establishedDate) {
        this.branchID = ++branchCounter;
        this.branchName = branchName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.managerName = managerName;
        this.openingHours = openingHours;
        this.establishedDate = establishedDate;
    }

    public Branch(String branchName , String location) {
        this.branchName = branchName;
        this.location = location;
    }
}
