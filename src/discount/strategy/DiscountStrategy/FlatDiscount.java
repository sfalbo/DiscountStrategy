package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class FlatDiscount implements DiscountStrategy {

    private double discountRate = 5.00;

    @Override
    public double getDiscountOffProduct(double price, double qty) {

        return discountRate;

    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountPercent) {
        this.discountRate = discountPercent;
    }

    // for testing
    public static void main(String[] args) {
        FlatDiscount fd = new FlatDiscount();
//        fd.setDiscountPercent(.10);
        double amount = fd.getDiscountOffProduct(10.00, 5);
        System.out.println("the FlatDiscount amount is " + amount);

    }

//    @Override
//    public void setPrice(double unitCost) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
    
    
}
