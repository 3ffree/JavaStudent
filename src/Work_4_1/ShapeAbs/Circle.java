package Work_4_1.ShapeAbs;

public class Circle extends Shape {

    double radius;

    String type = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.PI * radius;
    }
}
