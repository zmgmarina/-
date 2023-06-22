package seminarOOP_6.srp1;

import java.util.ArrayList;
import java.util.List;

public class Square {

    private List<Point> points;

    private int side;


    public int getSide() {
        return side;
    }

    public Square(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>(4);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

    }

    public int getArea(){
        return side * side;
    } //площадь квадрата
}
