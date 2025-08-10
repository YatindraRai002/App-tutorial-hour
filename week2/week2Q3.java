class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class week2Q3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("IDFC2509887547", "Rahul Sharma", 300000.0);
        acc.displayBalance();
    }
}
