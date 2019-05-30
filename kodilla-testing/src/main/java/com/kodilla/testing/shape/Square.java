package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    public double field;
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }
}
