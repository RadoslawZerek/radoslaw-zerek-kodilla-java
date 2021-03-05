package com.kodilla.good.patterns.challenges.food2door;

public class OrderRepo {
    public boolean createOrder(String customerName, String product, int quantity, double productPrice) {
        System.out.println(customerName + ": We will deliver to You " +
                product + " in an amount: " + quantity + "\nCost: " + (productPrice * quantity));
        return true;
    }
}
