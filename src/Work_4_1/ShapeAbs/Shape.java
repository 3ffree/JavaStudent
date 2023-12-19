package Work_4_1.ShapeAbs;

public abstract class Shape {
    public String type;
    public String getType() {
        return type;
    };
    public abstract double getArea();
    public abstract double getPerimetr();

}
