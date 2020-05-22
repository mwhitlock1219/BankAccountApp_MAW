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

    // List common methods - transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $ " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $ " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $ " + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance + "\nRate: "
                + rate + "%");
    }
}