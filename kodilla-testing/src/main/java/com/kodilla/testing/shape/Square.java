package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private Integer field;

    public Square(String shapeName, Integer field) {
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
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (!getShapeName().equals(square.getShapeName())) return false;
        return getField().equals(square.getField());
    }

    @Override
    public int hashCode() {
        int result = getShapeName().hashCode();
        result = 31 * result + getField().hashCode();
        return result;
    }
}
