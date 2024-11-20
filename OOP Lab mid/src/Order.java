import java.util.ArrayList;
import java.util.List;

class Order {
    List<Flavor> flavors;
    List<Topping> toppings;
    int waffleCone;
    double subtotal;

    public Order() {
        flavors = new ArrayList<>();
        toppings = new ArrayList<>();
        waffleCone = 0;
        subtotal = 0.0;
    }

    public void addFlavor(Flavor flavor) {
        flavors.add(flavor);
        subtotal += flavor.price;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        subtotal += topping.price;
    }

    public void chooseWaffleCone() {
        waffleCone = 1;
        subtotal += 5.00;
    }

    public double calculateTax() {
        return subtotal * 0.08;
    }

    public double calculateTotal() {
        return subtotal + calculateTax();
    }

}