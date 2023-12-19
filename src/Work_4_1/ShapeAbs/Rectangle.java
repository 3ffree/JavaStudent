package Work_4_1.ShapeAbs;

public class Rectangle extends Shape{

    String type = "Rectangle";
    double side_a;
    double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double getSide_a() {
        return side_a;
    }

    public void setSide_a(double side_a) {
        this.side_a = side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public void setSide_b(double side_b) {
        this.side_b = side_b;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getArea() {
        return this.side_a * this.side_b;
    }

    public double getPerimetr() {
        return 2 * (this.side_a + this.side_b);
    }
}
