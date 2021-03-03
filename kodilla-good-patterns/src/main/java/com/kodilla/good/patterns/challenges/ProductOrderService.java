package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {

    public boolean orderItem(Item item) {
        System.out.println("Order request for: " + item.getProductName());
        return true;
    }
    public void sendConfirm(Item item, InformationService service) {
        System.out.println("Sending confirmation");
        service.sendMessage(createConfirmMessage(item));
    }
    public String createConfirmMessage(Item item) {
        return "Thank you for using our store!" +
                "\n You bought a product: " + item.getProductName() +
                "\n Transaction value : " + item.getPrice() +
                "\n Transaction date: " + LocalDate.now() +
                "\n Product specification: " + item.getSpecification() +
                "\n The warranty and proof of purchase will be sent in the next e-mail";
    }
}
