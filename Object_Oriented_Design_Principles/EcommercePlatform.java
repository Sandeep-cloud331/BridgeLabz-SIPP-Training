import java.util.*;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Order class aggregates products
class Order {
    int orderId;
    List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("  - " + p.name + ": $" + p.price);
        }
    }
}

// Customer places orders
class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.orderId);
    }

    void showOrders() {
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

// Main class to demonstrate the model
public class EcommercePlatform {
    public static void main(String[] args) {
        // Products
        Product p1 = new Product("Laptop", 800.00);
        Product p2 = new Product("Mouse", 25.00);
        Product p3 = new Product("Keyboard", 45.00);

        // Customer
        Customer customer = new Customer("John");

        // Order with products
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show all orders
        customer.showOrders();
    }
}
