package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class CashRegister {

    private Receipt receipt;

    public void startnewSale(String custID) {

        receipt = new Receipt(custID);
    }

    public void addnewlineItem(String productID, double qty) {


        // assign each line item to receipt
        receipt.addNewLineItem(productID, qty);


    }

    public void displayInvoice() {

         receipt.displayInvoice();
        
    }

    
}
