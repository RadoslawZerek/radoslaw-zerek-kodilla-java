package com.kodilla.good.patterns.challenges.order;

public class OrderDTO {
    public User user;
    public boolean isOrdered;

    public OrderDTO(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
