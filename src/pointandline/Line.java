package pointandline;

public class Line {

    private Point point1;
    private Point point2;
    private double length;


    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    Line(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }
}
