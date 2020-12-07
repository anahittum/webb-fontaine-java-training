package pointandline;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PointAndLineTest {

    @BeforeClass
    public void setUp() {
    }

    @AfterClass
    public void tearDown() {
        System.out.println("after all tests");
    }

    @Test
    public void testGetDistancePosiiveCase() {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(7, 12);
        double result = PointAndLineAPI.getDistance(p1, p2);
        Assert.assertEquals(result, 7.615773105863909, "This test has failed");
    }

    @Test
    public void testGetDistanceNullCheck() {
        Point p1 = null;
        Point p2 = new Point(7, 12);
        double result = PointAndLineAPI.getDistance(p1, p2);
        Assert.assertEquals(result, 0.0, "This test has failed");
    }

    @Test
    public void testGetMiddlePoint() {
        Point p1 = new Point(-1, 2);
        Point p2 = new Point(3, -6);

        Point expected = new Point(1, -2);
        Point result = PointAndLineAPI.getMiddlePoint(p1, p2);

        Assert.assertEquals(expected, result);
    }

    @Test

    public void testIsPointOnLine() {
        Point point = new Point(4, 4);
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 5);
        Line line = new Line(p1, p2);

        boolean result = PointAndLineAPI.isPointOnLine(point, line);
        Assert.assertTrue(result);

    }

    @Test

    public void testCanFormSquare() {
        Point p1 = new Point(2, 6);
        Point p2 = new Point(5, 1);
        Point p3 = new Point(0, -2);
        Point p4 = new Point(-3, 3);

        boolean result = PointAndLineAPI.canFormSquare(p1, p2, p3, p4);
        Assert.assertTrue(result);

    }
}