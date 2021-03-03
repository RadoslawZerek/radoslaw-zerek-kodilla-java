package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {
    private String address;

    public EmailService(String address) {
        this.address = address;
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
        System.out.println("Message sent to: " + address);
    }
}
