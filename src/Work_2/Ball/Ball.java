package Work_2.Ball;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisposal, double yDisposal) {
        this.x += xDisposal;
        this.y += yDisposal;
    }

    public String toString() {
        return "X = " + this.x + " Y = " + this.y + '\n';
    }
}
