package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private OrderRepo orderRepo;

    public OrderProcessor(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
    public OrderRequest startProcess(CustomerInterface customerInterface) {
        boolean isOrdered = customerInterface.process();

        if (isOrdered) {
            orderRepo.createOrder(customerInterface.getClass().getSimpleName(),
                    customerInterface.getProduct(), customerInterface.getQuantity(), customerInterface.getProductPrice());
            return new OrderRequest(true, customerInterface.getQuantity(),
                    customerInterface.getProduct());
        } else {
            return new OrderRequest(false, customerInterface.getQuantity(),
                    customerInterface.getProduct());
        }
    }
}
