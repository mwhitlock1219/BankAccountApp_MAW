public abstract class Account implements IBaseRate {
    // list common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 1000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Debugger - used to check that the following items are printing/working
        // System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: " +
        // balance);

        // set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance + "\nRate: "
                + rate + "%");
    }
}