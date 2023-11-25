package org.lab;

public class ECommerceDemo {
    // This will be main class for demonstrating functionality.
    // Initialize the ECommercePlatform, add users and products, simulate user interaction with the cart, and simulate order creation and processing a log every action to console.

    public static void main(String[] args) {
        ECommercePlatform eCommercePlatform = new ECommercePlatform();

        User user1 = new User(1, "John");
        User user2 = new User(2, "Jane");

        Product product1 = new Product(1, "Product 1", 100, 10);
        Product product2 = new Product(2, "Product 2", 200, 20);
        Product product3 = new Product(3, "Product 3", 300, 30);

        eCommercePlatform.addUser(user1);
        eCommercePlatform.addUser(user2);
        eCommercePlatform.addProduct(product1);
        eCommercePlatform.addProduct(product2);
        eCommercePlatform.addProduct(product3);

        System.out.println("Products:");
        eCommercePlatform.listProducts();
        System.out.println("Users:");
        eCommercePlatform.listUsers();

        user1.addToCart(product1, 1);
        user1.addToCart(product2, 2);
        user1.addToCart(product3, 3);
        user1.removeFromCart(product1);
        user1.updateProductInCart(product2, 3);

        user2.addToCart(product1, 1);
        user2.addToCart(product2, 2);
        user2.addToCart(product3, 3);
        user2.removeFromCart(product1);
        user2.updateProductInCart(product2, 3);

        Order order1 = new Order(1, 1, user1.getCart());
        Order order2 = new Order(2, 2, user2.getCart());

        eCommercePlatform.createOrder(order1);
        eCommercePlatform.createOrder(order2);
        System.out.println("Orders:");
        eCommercePlatform.listOrders();

        eCommercePlatform.updateStock(product1, 5);
        eCommercePlatform.updateStock(product2, 10);
        eCommercePlatform.updateStock(product3, 15);
        System.out.println("Products after stock update:");
        eCommercePlatform.listProducts();
    }


}
