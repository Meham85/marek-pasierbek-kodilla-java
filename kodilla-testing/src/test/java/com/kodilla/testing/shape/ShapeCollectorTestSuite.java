package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addFigure() {
        Circle testCircle = new Circle("circle1", 10.00);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(testCircle) ;
        int afterSize = shapeCollector.figureArrayList.size();
        Assert.assertEquals(1, afterSize);
    }

    /* @Test (expected = IllegalArgumentException.class)
    public void addFigureWrongClass() {
        String testCircle = "Object String Class";

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(testCircle) ;
        int afterSize = shapeCollector.figureArrayList.size();
        Assert.assertEquals(1, afterSize);
    } */

    @Test
    public void removeFigure() {
        Circle testCircle = new Circle("circle1", 10.00);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(testCircle) ;
        int afterSize = shapeCollector.figureArrayList.size();
        shapeCollector.removeFigure(testCircle) ;
        int removeSize = shapeCollector.figureArrayList.size();
        Assert.assertEquals(afterSize, removeSize +1);
    }


    @Test
    public void getFigure() {
        Circle testCircle1 = new Circle("circle1", 10.00);
        Square testSquare2 = new Square("square2", 15.00);
        Triangle testTriangle3 = new Triangle("triangle3", 20.00);
        Circle testCircle4 = new Circle("circle4", 25.00);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(testCircle1) ;
        shapeCollector.addFigure(testSquare2) ;
        shapeCollector.addFigure(testTriangle3) ;
        shapeCollector.addFigure(testCircle4) ;
        Shape gettingFigure = shapeCollector.getFigure(3);
        Assert.assertEquals("circle4", gettingFigure.getShapeName());
    }
    @Test
    public void showFigures() {
        Circle testCircle1 = new Circle("circle1", 10.00);
        Square testSquare2 = new Square("square2", 15.00);
        Triangle testTriangle3 = new Triangle("triangle3", 20.00);
        Circle testCircle4 = new Circle("circle4", 25.00);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(testCircle1) ;
        shapeCollector.addFigure(testSquare2) ;
        shapeCollector.addFigure(testTriangle3) ;
        shapeCollector.addFigure(testCircle4) ;
        shapeCollector.showFigures();

    }
}
