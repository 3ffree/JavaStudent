package Work_4_1.ShapeAbs;

public class Square extends Rectangle{
    String type = "Square";
    double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
