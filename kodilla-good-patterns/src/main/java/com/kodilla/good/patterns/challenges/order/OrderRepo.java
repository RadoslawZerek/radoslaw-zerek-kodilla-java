package com.kodilla.good.patterns.challenges.order;

public interface OrderRepo {
    boolean createOrder(final OrderRequest orderRequest);
}
