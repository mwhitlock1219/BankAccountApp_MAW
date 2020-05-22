public class Checking extends Account {
    // List properties specific to a Checking account
    int debitCard;
    int debitCardPIN;

    // Constructor to initialize checking account properies
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW CHECKING ACCOUNT");

    }

    // List any methods specific to checking account
}