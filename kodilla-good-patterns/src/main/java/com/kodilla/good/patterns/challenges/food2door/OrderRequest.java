package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private boolean isOrdered;
    private int quantity;
    private String product;

    public OrderRequest(boolean isOrdered, int quantity, String product) {
        this.isOrdered = isOrdered;
        this.quantity = quantity;
        this.product = product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }
}
