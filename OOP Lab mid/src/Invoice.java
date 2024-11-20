import java.io.FileWriter;
import java.io.IOException;

class Invoice {
    public static void generateInvoice(Order order, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Ice Cream Shop Invoice\n");
            for (Flavor flavor : order.flavors) {
                writer.write(flavor.name + " - 1 scoop: $" + flavor.price + "\n");
            }
            for (Topping topping : order.toppings) {
                writer.write(topping.name + " - 1 time: $" + topping.price + "\n");
            }
            writer.write("Subtotal: $" + order.subtotal + "\n");
            writer.write("Tax: $" + String.format("%.2f", order.calculateTax()) + "\n");
            writer.write("Total Amount Due: $" + String.format("%.2f", order.calculateTotal()) + "\n");
        }
    }
}