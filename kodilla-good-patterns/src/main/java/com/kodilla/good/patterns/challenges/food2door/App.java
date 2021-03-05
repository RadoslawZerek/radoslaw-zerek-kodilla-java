package com.kodilla.good.patterns.challenges.food2door;

public class App {
    public static void main(String[] args) {
        CustomerName customerName = new CustomerName();
        CustomerInterface customerInterface = customerName.chooseCustomer("Sample Product", 13);
        OrderProcessor orderProcessor = new OrderProcessor(new OrderRepo());
        orderProcessor.startProcess(customerInterface);
    }
}
