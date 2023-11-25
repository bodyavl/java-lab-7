package org.lab;

import java.util.HashMap;
import java.util.Map;

public class ECommercePlatform {
    Map<Integer, User> users;
    Map<Integer, Product> products;
    Map<Integer, Order> orders;

    public ECommercePlatform() {
        users = new HashMap<>();
        products = new HashMap<>();
        orders = new HashMap<>();
    }

    // Implement methods to add users, products, create an order, list available products, list users, list orders, and update stock.

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void createOrder(Order order) {
        orders.put(order.getId(), order);
    }

    public void listProducts() {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void listUsers() {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void listOrders() {
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void updateStock(Product product, int stock) {
        product.setStock(stock);
    }


}
