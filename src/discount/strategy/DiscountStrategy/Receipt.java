package discount.strategy.DiscountStrategy;

/**
 * 
 *
 * @author sfalbo
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItems;
    private Product product;
    private String finalInvoice;

    public Receipt(String custID) {

        customer = findCustomerById(custID);

    }
    private Customer[] customerDb = {
        new Customer("Abigail Sowle", "AS2010"),
        new Customer("Madison Carmella", "MC2007"),
        new Customer("Cooper Patch", "CP2006")
    };

    private Customer findCustomerById(String id) {
        Customer Customer = null;

        for (Customer c : customerDb) {
            if (id.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        return customer;
    }
    
    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public void addNewLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty);
        if (lineItems == null) {
            lineItems = new LineItem[1];
            lineItems[0] = lineItem;

        } else {
            LineItem[] tempLineItems = lineItems;
            lineItems = new LineItem[tempLineItems.length + 1];
            for(int i = 0; i < tempLineItems.length; i++) {
                lineItems[i] = tempLineItems[i];
            }
            lineItems[(lineItems.length) - 1] = lineItem;

        }

    }
    
    public String getFinalInvoice(){
        return finalInvoice;
    }

    public void startNewSale(String custId) {
    }

    public double finalizeSale() {
        //loop thru line items

        double grandTotal = 0.0;
        for (LineItem l : lineItems) {
            grandTotal += l.getLineItemTotal();
        }
        return grandTotal;

    }
    
    void displayInvoice() {

        System.out.println("The Customer ID: " + customer.getCustomerID());
        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("Product ID\t" + "Product Name\t" + "Unit Price\t\t" + "Quantity\t" + "Total Price");
        System.out.println("------------------------------------------------------------------------");
        
        for (LineItem im : lineItems){
            String productId = im.getProductId();
            double qnty = im.getQty();
            double ltot = im.getLineItemTotal();
            Product prod = im.getProductByID(productId);
            String prdnme = prod.getProductName();
            double up = prod.getUnitCost();
            
            System.out.println(productId + "\t\t" + prdnme + "\t\t" + up + "\t\t\t" + qnty + "\t\t" + ltot);
            
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Grand Total for today is: " + finalizeSale());
        //rest of the invoice needs to go here.
        //I ran out of time working a lot on the temp array list.

    }
}
