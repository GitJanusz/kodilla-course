package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private Integer field;

    public Triangle(String shapeName, Integer field) {
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
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (!getShapeName().equals(triangle.getShapeName())) return false;
        return getField().equals(triangle.getField());
    }

    @Override
    public int hashCode() {
        int result = getShapeName().hashCode();
        result = 31 * result + getField().hashCode();
        return result;
    }
}
