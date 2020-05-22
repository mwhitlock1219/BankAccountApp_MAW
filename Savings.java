public class Savings extends Account {
    // List properties specific to a Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize savings account properies
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        // Debugger - used to check that the following items are printing/working
        // System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
        // System.out.println("NEW SAVINGS ACCOUNT");

    }

    // List any methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings Account");
    }

}