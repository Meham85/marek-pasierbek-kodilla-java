package com.kodilla.testing.shape;

public class Triangle implements Shape {

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

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }
}
