package org.lab;

import java.util.HashMap;

public class User {
    Integer id;
    String name;
    HashMap<Product, Integer> cart;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        cart = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Product, Integer> getCart() {
        return cart;
    }

    public void addToCart(Product product, Integer quantity) {
        cart.put(product, quantity);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void clearCart() {
        cart.clear();
    }

    public void updateProductInCart(Product product, Integer quantity) {
        cart.replace(product, quantity);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s", id, name);
    }
}
