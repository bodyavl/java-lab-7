package org.lab;

import java.util.HashMap;
import java.util.Map;

public class Order {
    Integer id;
    Integer userId;
    HashMap<Product, Integer> orderDetails;
    double totalPrice = 0;
    
    public Order(Integer id, Integer userId, HashMap<Product, Integer> orderDetails) {
        this.id = id;
        this.userId = userId;
        this.orderDetails = orderDetails;
        for (Map.Entry<Product, Integer> entry : orderDetails.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
    }

    // implement getters and setters

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public HashMap<Product, Integer> getOrderDetails() {
        return orderDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, User ID: %d, Order Details: %s, Total Price: %.2f", id, userId, orderDetails, totalPrice);
    }

    void orderDetailsToString() {
        for (Map.Entry<Product, Integer> entry : orderDetails.entrySet()) {
            System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
        }
    }

}
