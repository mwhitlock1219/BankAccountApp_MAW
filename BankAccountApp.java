import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
        // Savings savacc1 = new Savings("Rich Lowe", "234567891", 2500);

        // // savacc1.compound();

        // savacc1.showInfo();
        // System.out.println("***********************");
        // chkacc1.showInfo();

        // // savacc1.deposit(5000);
        // // savacc1.withdraw(200);
        // // savacc1.transfer("Brokerage", 3000);

        // Read a CSV file , then create new accounts based n that data
        String file = "C:\\Users\\malej\\WIN2020\\Week 11\\Day5-UdemyOOP\\BankAccountApp\\original.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            // System.out.println(name + " " + sSN + " " + accountType + " $" +
            // initDeposit);
            if (accountType.equals("Savings")) {
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));

            } else if (accountType.equals("Checking")) {
                // System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));

            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

            // to check if it would print all columns in the csv file
            // System.out.println("NEW ACCOUNT");
            // System.out.println(accountHolder[0]); //Name
            // System.out.println(accountHolder[1]); //SSN
            // System.out.println(accountHolder[2]); //Account Type
            // System.out.println(accountHolder[3]); // Initial Deposit
        }
        // accounts.get(5).showInfo();
        for (Account acc : accounts) {
            System.out.println("\n******************");
            acc.showInfo();
        }
        accounts.get((int) Math.random() * accounts.size()).deposit(10000);
        accounts.get((int) Math.random() * accounts.size()).deposit(1500);
    }
}