import java.math.BigDecimal;

/**
 * Created by davit.harutyunyan on 7/2/2016.
 */
public class Main {

    public static void main(String[] args) {
        //First Strategy Customer
        StandardAccount bankAccountLow = new StandardAccount(BigDecimal.valueOf(0), BigDecimal.valueOf(5));
        Customer lowCustomer = new Customer(new CustomerStrategyLow(), bankAccountLow);
        System.out.println("Customer percent was : " + lowCustomer.getAccount().getPercent());
        lowCustomer.changePercentRate();
        System.out.println("Customer percent changed to : " + lowCustomer.getAccount().getPercent());

        //Second Strategy Customer
        StandardAccount bankAccountHigh = new StandardAccount(BigDecimal.valueOf(0), BigDecimal.valueOf(8));
        Customer highCustomer = new Customer(new CustomerStrategyHigh(), bankAccountHigh);
        System.out.println("Second customer percent was : " + highCustomer.getAccount().getPercent());
        highCustomer.changePercentRate();
        System.out.println("Second customer percent changed to : " + highCustomer.getAccount().getPercent());
    }

}
