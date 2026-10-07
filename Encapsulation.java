class BankAccount {

    private String accountHolder;
    private double balance;

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter
    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Vedant");
        account.setBalance(5000);

        System.out.println("Account Holder: " +
                account.getAccountHolder());

        System.out.println("Balance: " +
                account.getBalance());
    }
}
