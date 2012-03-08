package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class Startup {

    public static void main(String[] args) {

        CashRegister cr = new CashRegister();

        cr.startnewSale("AS2010");
        cr.addnewlineItem("SS401", 3);
        cr.addnewlineItem("SS502", 4);
        cr.addnewlineItem("SS602", 6);

        


        cr.displayInvoice();



    }
}
