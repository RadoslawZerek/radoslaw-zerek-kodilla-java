package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();

        Item book = new Item("Smart business",
                "The best book for every modern businessman",
                98.99, LocalDate.now());
        InformationService mail = new EmailService("john.doe@mail.com");

        if (productOrderService.orderItem(book)) {
            productOrderService.sendConfirm(book, mail);
        } else {
            System.out.println("Error! The order has failed!");
        }
    }
}