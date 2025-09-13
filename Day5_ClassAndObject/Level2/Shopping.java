import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to the cart.");
    }
    void removeItem(String itemName) {
        for (CartItem item : items) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                items.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }
    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost of Cart: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Mouse", 1000, 2);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayTotalCost();

        System.out.println("-------------------");

        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}

