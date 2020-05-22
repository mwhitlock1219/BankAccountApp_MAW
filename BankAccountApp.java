import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\malej\\WIN2020\\Week 11\\Day5-UdemyOOP\\BankAccountApp\\original.csv";

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
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}