package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    private static int testCounter1 = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("The beginning of tests.");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterEach
    public void afterEveryTest() {
        testCounter1++;
        System.out.println("Finished executing test #" + testCounter1);
    }

    @Nested
    @DisplayName("Tests of figures")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            Shape circle = new Circle("circle", 21);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, collector.getQuantityFigures());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape circle = new Circle("circle", 21);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);

            //When
            collector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, collector.getQuantityFigures());
        }

        @Test
        void testGetFigure() {
            //Given
            Shape circle = new Circle("circle", 21);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);

            //When
            Shape result = collector.getFigure(0);

            //Then
            Assertions.assertEquals(result, circle);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("circle", 21);
            collector.addFigure(circle);

            //When
            Shape result = collector.showFigures(circle);

            //Then
            Assertions.assertEquals(result, circle);
        }
    }
}
