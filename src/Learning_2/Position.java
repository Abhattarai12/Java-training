package Learning_2;

public class Position {
    private double x, y;
    public Position (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double setX (double x) {
        return this.x = x;
    };
    public double setY (double y) {
        return this.y = y;
    }

}
