package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Item {
    private String productName;
    private String specification;
    private double price;
    private LocalDate date;

    public Item(String productName, String specification, double price, LocalDate date) {
        this.productName = productName;
        this.specification = specification;
        this.price = price;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProductName() {
        return productName;
    }

    public String getSpecification() {
        return specification;
    }
}
