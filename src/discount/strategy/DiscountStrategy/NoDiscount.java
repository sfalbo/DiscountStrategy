package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class NoDiscount implements DiscountStrategy {

    private double discountRate = 0.00;

    @Override
    public double getDiscountOffProduct(double price, double qty) {
        return 0;
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
//    public static void main(String[] args){
//        NoDiscount nd = new NoDiscount();
////        fd.setDiscountPercent(.10);
//        double amount = nd.getDiscountAmount(10.00, 5);
//        System.out.println("the NoDiscount amount is " + amount);
//    }
//    

//    @Override
//    public void setPrice(double unitCost) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
}
