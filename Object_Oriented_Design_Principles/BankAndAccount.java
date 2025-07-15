import java.util.*;

class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Account openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(this, customer, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() +
                               ", Balance: " + acc.getBalance());
        }
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAndAccount {
    public static void main(String[] args) {
        Bank hdfc = new Bank("SBI Bank");
        Customer nikhil = new Customer("Nikhil");

        hdfc.openAccount(nikhil, 5000);
        hdfc.openAccount(nikhil, 12000);

        nikhil.viewBalance();
    }
}


