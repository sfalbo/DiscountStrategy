package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class QuanityDiscount implements DiscountStrategy {

    private double discountRate = .10;
//    private double discountAmount;
    private int minQty = 2;

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double getDiscountOffProduct(double price, double qty) {

//        discountAmount = (price * qty) * discountRate;

        if (qty >= minQty) {
            return (price * qty) * discountRate;
        }
        return 0;
    }

    @Override
    public void setDiscountRate(double discountPercent) {
        this.discountRate = discountPercent;
    }
    
    
//    public static void main(String[] args){
//        QuanityDiscount qd = new QuanityDiscount();
////        fd.setDiscountPercent(.10);
//        double amount = qd.getDiscountAmount(10.00, 1);
//        System.out.println("the Quanity Discount amount is " + amount);
//        
//    }

//    @Override
//    public void setPrice(double unitCost) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
}
