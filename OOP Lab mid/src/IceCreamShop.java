import java.io.IOException;

public class IceCreamShop {
    public static void main(String[] args) {
        // Initialize shop menu
        Flavor mintChoco = new Flavor("Mint Chocolate Chip", 2.80);
        Flavor chocoFudge = new Flavor("Chocolate Fudge", 3.00);
        Flavor strawberrySwirl = new Flavor("Strawberry Swirl", 2.75);
        Flavor pistachioDelight = new Flavor("Pistachio Delight", 3.25);

        Topping sprinkles = new Topping("Sprinkles", 0.30);
        Topping marshmallow = new Topping("Marshmallow", 0.70);
        Topping crushedOreo = new Topping("Crushed Oreo", 0.85);
        Topping freshStrawberries = new Topping("Fresh Strawberries", 1.00);
        Topping chocoChips = new Topping("Chocolate Chips", 0.50);

        // Create an order
        Order order = new Order();
        order.addFlavor(chocoFudge);
        order.addFlavor(mintChoco);
        order.addTopping(chocoChips);
        order.addTopping(freshStrawberries);
        order.chooseWaffleCone();

        // Generate invoice
        try {
            Invoice.generateInvoice(order, "Invoice.txt");
            System.out.println("Invoice generated successfully!");
        } catch (IOException e) {
            System.out.println("Error generating invoice: " + e.getMessage());
        }
    }
}