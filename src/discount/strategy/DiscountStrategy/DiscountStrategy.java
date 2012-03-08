package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public interface DiscountStrategy {

    double getDiscountOffProduct(double price, double qty);

    double getDiscountRate();

    void setDiscountRate(double discountPercent);

//    public void setPrice(double unitCost);
}
