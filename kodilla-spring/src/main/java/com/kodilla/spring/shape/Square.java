package com.kodilla.spring.shape;
//Drugi sposób tworzenia Beanów
public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "This is a square";
    }
}
