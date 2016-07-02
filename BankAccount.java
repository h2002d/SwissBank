import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 7/2/2016.
 */
public class BankAccount {
    private BigDecimal balance;
    private BigDecimal percent;


    public BankAccount(BigDecimal balance, BigDecimal percent) {
        this.balance = balance;
        this.percent = percent;
    }

    public void withDraw(BigDecimal cash) {
        this.balance = this.balance.divide(cash);
    }

    public void deposit(BigDecimal cash) {
        this.balance = this.balance.add(cash);
    }

    public void monthlyPercent() {
        balance.multiply(percent).divide(BigDecimal.valueOf(100));
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getPercent() {
        return percent;
    }
}
