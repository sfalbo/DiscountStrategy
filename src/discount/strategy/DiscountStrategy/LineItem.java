package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class LineItem {

    private String productId;
    private double qty;
    private Product product;
    
    
    public LineItem(String productId, double qty) {
        this.productId = productId;
        this.qty = qty;
        this.product = getProductByID(productId);
    }

            
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    private Product[] productDB = {
        new Product("Socks", "SS401", 7.99, new BackToSchoolDiscount()),
        new Product("Skirt", "SS502", 17.99, new NoDiscount()),
        new Product("Flops", "SS602", 21.89, new FlatDiscount())
      } ;
    
    public Product getProductByID(String productId){
        
        for(Product p : productDB)
        {
            if (p.getProductID().equals(productId)){
                return p;
            }
        }   
        return null;
    }
    
    public double getTotalDiscount() {
        return roundUpCents(product.getTotalDiscount(qty));
    }

    public double getLineItemTotal() {
        return roundUpCents(product.getUnitCost() * qty - getTotalDiscount());
    }
    
    //I took this from your program becuase I wasn't sure how to do this.
     private double roundUpCents(double value) {
        double result = value * 100;
        result = Math.round(result);
        result = result / 100;
        return result;
    }
    
}