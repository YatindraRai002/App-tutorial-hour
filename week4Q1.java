import java.util.*;

class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public void transfer(BankAccount to, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            to.deposit(amount);
        }
    }

    public void display() {
        System.out.println(accountNumber + " " + accountHolder + " " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class week4Q1 {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        accounts.add(new BankAccount("1001", "Amit", 5000));
        accounts.add(new BankAccount("1002", "Priya", 7000));
        while (true) {
            int ch = sc.nextInt();
            if (ch == 1) for (BankAccount a : accounts) a.display();
            else if (ch == 2) {
                String n = sc.next(); double amt = sc.nextDouble();
                BankAccount a = find(accounts, n); if (a != null) a.deposit(amt);
            } else if (ch == 3) {
                String n = sc.next(); double amt = sc.nextDouble();
                BankAccount a = find(accounts, n); if (a != null) a.withdraw(amt);
            } else if (ch == 4) {
                String f = sc.next(), t = sc.next(); double amt = sc.nextDouble();
                BankAccount af = find(accounts, f), at = find(accounts, t);
                if (af != null && at != null) af.transfer(at, amt);
            } else if (ch == 5) break;
        }
    }

    public static BankAccount find(ArrayList<BankAccount> accounts, String n) {
        for (BankAccount a : accounts) if (a.getAccountNumber().equals(n)) return a;
        return null;
    }
}