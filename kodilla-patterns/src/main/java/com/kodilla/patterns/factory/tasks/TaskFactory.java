package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Run", "to shopping center", "gps");
            case PAINTING_TASK:
                return new PaintingTask("Paint", "blue", "sky");
            case SHOPPING_TASK:
                return new ShoppingTask("Buy", "bread", 2);
            default:
                return null;
        }
    }
}
