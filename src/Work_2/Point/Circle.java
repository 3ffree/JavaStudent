package Work_2.Point;

public class Circle {
    private Point origin;
    private double radius;

    public Circle(Point origin, double radius) {
        this.origin = origin;
        this.radius = radius;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
