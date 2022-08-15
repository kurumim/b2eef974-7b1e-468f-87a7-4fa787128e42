package banking;

/**
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
    private Bank bank;

    private Long accountNumber;

    int attemptedPin;

    public Transaction(final Bank bank, final Long accountNumber, final int attemptedPin) throws Exception {
        if(!bank.authenticateUser(accountNumber,attemptedPin))
            throw new Exception();
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.attemptedPin = attemptedPin;
    }



    public double getBalance() {
        return bank.getBalance(this.accountNumber);
    }

    public void credit(double amount) {
        bank.credit(accountNumber,amount);
    }

    public boolean debit(double amount) {
        return bank.debit(accountNumber,amount);
    }
}
