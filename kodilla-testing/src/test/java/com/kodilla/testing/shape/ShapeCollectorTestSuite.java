package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding and removing figures")

    class AddingAndRemovingTests {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle(1));

            //Then
            int size = shapeCollector.getFigure();
            Assertions.assertEquals(1, size);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            int size = shapeCollector.getFigure();
            Assertions.assertEquals(0, size);
        }
    }
        @Nested
        @DisplayName("Tests for getting and showing figures.")

    class GettingAndShowingTests {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(1));
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(new Triangle(2, 3));

            //When
            Shape result = shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(square, result);
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(5, 6));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Circle(8));

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Triangle" + "Square" + "Circle", result);
        }
    }
}
