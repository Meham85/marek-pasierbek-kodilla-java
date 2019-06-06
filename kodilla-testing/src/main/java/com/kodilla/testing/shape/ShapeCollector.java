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
        if (figureArrayList.contains(shape) == false) {
            System.out.println("This figure is not out array element");
        } else {
            figureArrayList.remove(shape);
        }
    }
    public Shape getFigure(int index) {
        if (index < 0 || index > figureArrayList.size()) {
            return null;
        } else {
           return figureArrayList.get(index);
        }

    }

   public void showFigures() {
       for (int i = 0; i < figureArrayList.size(); i++) {
           Shape temportaryFigure = figureArrayList.get(i);

           System.out.println("name " + temportaryFigure.getShapeName() + " field " + temportaryFigure.getField());
       }
   }

    }

