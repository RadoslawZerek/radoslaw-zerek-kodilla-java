package com.kodilla.good.patterns.challenges.order;

public class ConfirmService implements InformationService {
    @Override
    public void sendMessage(User user) {
        System.out.println("An order confirmation e-mail has been sent to the address provided");
    }
}
