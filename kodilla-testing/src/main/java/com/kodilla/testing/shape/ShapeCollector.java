package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
public class ShapeCollector  {

    public ArrayList<Shape>  figureArrayList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {

        figureArrayList.add(shape);
    }


    public void removeFigure(Shape shape) {
        if (figureArrayList.contains(shape) == false)
            throw new IllegalArgumentException("Invalid Shape name");
        figureArrayList.remove(shape);
    }
    public Shape getFigure(int index) {
        if (index <0 || index > figureArrayList.size())
            throw new IllegalArgumentException("Invalid index specyfication");
        return figureArrayList.get(index);

    }
   /*  public Shape showFigures() {
        for (int i =0; i< figureArrayList.size(); i++) {
            return Shape temportaryFigure = figureArrayList.get(i);
        }
        for( Shape figures: figureArrayList) {
            System.out.println("name " + figures.getShapeName() + "field " + figures.getField());
        }
        return Shape; */
    }

