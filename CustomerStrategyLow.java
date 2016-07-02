import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 7/2/2016.
 */
public class CustomerStrategyLow implements AccountStrategy {
    @Override
    public BigDecimal getPercent() {
        return BigDecimal.valueOf(10);
    }
}
