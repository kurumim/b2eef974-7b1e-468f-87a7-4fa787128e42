package banking;

public class ConsumerAccount extends Account {

    private Person person;
    private Long accountNumber;
    private int pin;
    private double currentBalance;

    public ConsumerAccount(final Person person, final Long accountNumber, final int pin, final double currentBalance) {
        super(null,accountNumber,pin,currentBalance);
        this.person = person;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.currentBalance = currentBalance;
    }
}
