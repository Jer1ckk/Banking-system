public class Branch {
    private static int branchCounter = 0;
    private int branchID;
    private String branchName;
    private String location;
    private String phoneNumber;
    private String managerName;
    private String openingHours;
    private String establishedDate;

    public Branch(String branchName, String location, String phoneNumber, String managerName, String openingHours, String establishedDate) {
        this.branchID = ++branchCounter;
        this.branchName = branchName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.managerName = managerName;
        this.openingHours = openingHours;
        this.establishedDate = establishedDate;
    }

    public int getBranchID() {
        return branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }
}
