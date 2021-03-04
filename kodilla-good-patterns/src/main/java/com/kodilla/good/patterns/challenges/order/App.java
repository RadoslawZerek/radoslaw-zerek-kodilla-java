package com.kodilla.good.patterns.challenges.order;

public class App {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.request();
        OrderProcessor orderProcessor = new OrderProcessor(new ConfirmService(),
                new ProductOrderService(), new ProductOrderRepo());
        orderProcessor.process(orderRequest);
    }
}
