package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements CustomerInterface {
    private OrderRequest orderRequest;
    private String product;
    private int quantity;
    private double productPrice;

    public HealthyShop(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public boolean process() {
        System.out.println("The order is carried out by Healthy Shop");
        return true;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getProductPrice() {
        return productPrice = 4.20;
    }
}
