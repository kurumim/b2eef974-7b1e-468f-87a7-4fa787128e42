package banking;

import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 * <p>
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account {
    private List<Person> authorizedUsers;

    Company company;
    Long accountNumber;
    int pin;
    double startingDeposit;

    public CommercialAccount(final Company company, final Long accountNumber, final int pin, final double startingDeposit) {
        super(null,accountNumber,pin,startingDeposit);
        this.company = company;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.startingDeposit = startingDeposit;
    }

    /**
     * @param person The authorized user to add to the account.
     */
    protected void addAuthorizedUser(Person person) {
        // complete the function
    }

    /**
     * @param person
     * @return true if person matches an authorized user in {@link #authorizedUsers}; otherwise, false.
     */
    public boolean isAuthorizedUser(Person person) {
        // complete the function
        return true;
    }
}
