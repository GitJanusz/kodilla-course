package com.kodilla.good.patterns.challenges.task2;

public class OrderedDto {
    
    private User user;
    private boolean isOrdered;

    public OrderedDto(User user, boolean isOrdered) {
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
