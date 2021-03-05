package com.kodilla.good.patterns.challenges.food2door;

public class CustomerName {
    public CustomerInterface chooseCustomer(String product, int quantity) {
        if (quantity < 6) {
            return new HealthyShop(product, quantity);
        } else if (quantity >= 7 && quantity < 12) {
            return new GlutenFreeShop(product, quantity);
        } else {
            return new ExtraFoodShop(product, quantity);
        }
    }
}
