import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class IceCreamShopTest {

    @Test
    void testAddFlavor() {
        Order order = new Order();
        Flavor chocolateFudge = new Flavor("Chocolate Fudge", 3.00);
        order.addFlavor(chocolateFudge);
        assertEquals(3.00, order.subtotal, 0.01);
    }

    @Test
    void testAddTopping() {
        Order order = new Order();
        Topping sprinkles = new Topping("Sprinkles", 0.30);
        order.addTopping(sprinkles);
        assertEquals(0.30, order.subtotal, 0.01);
    }

    @Test
    void testWaffleCone() {
        Order order = new Order();
        order.chooseWaffleCone();
        assertEquals(5.00, order.subtotal, 0.01);
    }

    @Test
    void testCalculateTotalWithTax() {
        Order order = new Order();
        order.addFlavor(new Flavor("Strawberry Swirl", 2.75));
        order.addTopping(new Topping("Crushed Oreo", 0.85));
        double total = order.calculateTotal();
        assertEquals(3.89, total, 0.01);
    }

    @Test
    void testInvoiceGeneration() throws IOException {
        Order order = new Order();
        order.addFlavor(new Flavor("Chocolate Fudge", 3.00));
        order.addTopping(new Topping("Marshmallow", 0.70));
        order.chooseWaffleCone();
        Invoice.generateInvoice(order, "TestInvoice.txt");
    }
}
