package pointandline;

class PointAndLineAPI {

    // distance between two points
    static double getDistance(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            return 0.0;
        }

        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        if (x1 == x2 && y1 == y2) {
            return 0.0;
        }

        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

    }

//     the middle point between of two points

    static Point getMiddlePoint(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            return p1;
        }

        Point middlePoint = new Point();
        middlePoint.setX((p1.getX() + p2.getX()) / 2);
        middlePoint.setY((p1.getY() + p2.getY()) / 2);

        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            return p1;
        }
        return middlePoint;
    }


    // is the given Point on the Line
    static boolean isPointOnLine(Point point, Line line) {


        double k = 0, b = 0;
        double x = point.getX();
        double y = point.getY();

        Point p1 = line.getPoint1();
        Point p2 = line.getPoint2();

        if (p1 == null || p2 == null) {
            return false;
        }

        double p1x = p1.getX();
        double p1y = p1.getY();

        double p2x = p2.getX();
        double p2y = p2.getY();


        k = (p1y - p2y) / (p1x - p2x);

        b = p1y - k * p1x;


        return y == k * x + b;
    }

    // can be drawn a square with given 4 points


    static boolean canFormSquare(Point p1, Point p2, Point p3, Point p4) {


        double distanceP1P2 = Math.pow(getDistance(p1, p2), 2);
        double distanceP1P3 = Math.pow(getDistance(p1, p3), 2);
        double distanceP1P4 = Math.pow(getDistance(p1, p4), 2);

        if (distanceP1P2 == 0 || distanceP1P3 == 0 || distanceP1P4 == 0)
            return false;

        if (distanceP1P2 == distanceP1P3 && 2 * distanceP1P2 == distanceP1P4
                && 2 * Math.pow(getDistance(p2, p4), 2) == Math.pow(getDistance(p2, p3), 2)) {
            return true;
        }
        return distanceP1P2 == distanceP1P4 && 2 * distanceP1P2 == distanceP1P3
                && 2 * Math.pow(getDistance(p2, p3), 2) == Math.pow(getDistance(p2, p4), 2);
    }
}