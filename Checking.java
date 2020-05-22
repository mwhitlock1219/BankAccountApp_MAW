public class Checking extends Account {
    // List properties specific to a Checking account
    int debitCard;
    int debitCardPIN;

    // Constructor to initialize checking account properies
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");

    }

    // List any methods specific to checking account
}