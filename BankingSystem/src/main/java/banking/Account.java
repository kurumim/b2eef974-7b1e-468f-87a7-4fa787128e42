package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 * <p>
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;

    public Account(final AccountHolder accountHolder, final Long accountNumber, final int pin, final double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int attemptedPin) {
        return this.pin == attemptedPin;
    }

    public double getBalance() {
       return balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public  void creditAccount(double amount) {
        this.balance += amount;
    }

    public synchronized boolean debitAccount(double amount) {
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
}
