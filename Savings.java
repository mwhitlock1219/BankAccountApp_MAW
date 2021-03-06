public class Savings extends Account {
    // List properties specific to a Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize savings account properies
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        // Debugger - used to check that the following items are printing/working
        // System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
        // System.out.println("NEW SAVINGS ACCOUNT");

        setSafetyDespositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
        // System.out.println("Implement rate for Savings");
    }

    // List any methods specific to savings account

    private void setSafetyDespositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        // Check if it works
        // System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        // used to identify account in beginning
        // System.out.println("ACCOUNT TYPE: Savings Account");
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\n Safety Deposit Box ID: " + safetyDepositBoxID
                + "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}