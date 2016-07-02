import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 7/2/2016.
 */
public class CustomerStrategyHigh implements AccountStrategy {
    @Override
    public BigDecimal getPercent() {
        return BigDecimal.valueOf(30);
    }
}
