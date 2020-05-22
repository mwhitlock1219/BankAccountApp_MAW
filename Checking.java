public class Checking extends Account {
    // List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properies
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;

        // Debugger - used to check that the following items are printing/working
        // System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
        // System.out.println("NEW CHECKING ACCOUNT");

        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
        // System.out.println("Implement rate for Checking");
    }

    // List any methods specific to checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        // Check if it works
        // System.out.println(debitCard);
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        // used to identify account in beginning
        // System.out.println("ACCOUNT TYPE: Checking Account");
        super.showInfo();
        System.out.println("Your Checking Account Features" + "\n Debit Card Number: " + debitCardNumber
                + "\n Debit Card PIN: " + debitCardPIN);

    }
}