package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private Integer field;

    public Circle(String shapeName, Integer field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (!getShapeName().equals(circle.getShapeName())) return false;
        return getField().equals(circle.getField());
    }

    @Override
    public int hashCode() {
        int result = getShapeName().hashCode();
        result = 31 * result + getField().hashCode();
        return result;
    }
}
