package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if ( n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public Shape showFigures(Shape circle) {
        for (Shape shape: shapeList) {
            return shape;
        }
        return null;
    }

    public int getQuantityFigures() {
        return shapeList.size();
    }
}
