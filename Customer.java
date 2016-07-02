/**
 * Created by davit.harutyunyan on 7/2/2016.
 */
public class Customer {
    private AccountStrategy strategy;
    private BankAccount account;

    public Customer(AccountStrategy strategy, BankAccount account) {
        this.strategy = strategy;
        this.account = account;
    }

    public void changePercentRate() {
        account.setPercent(strategy.getPercent());
    }

    public BankAccount getAccount() {
        return account;
    }
}
