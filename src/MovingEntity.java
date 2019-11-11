
public abstract class MovingEntity extends SoftEntity {

    private double dx;
    private double dy;

    public MovingEntity(double x, double y, double width, double height, String url) {
        super(x, y, width, height, url);
    }

    public MovingEntity(double x, double y, double width, double height, String url, double yScale) {
        super(x, y, width, height, url, yScale);
    }

    public MovingEntity(double x, double y, double width, double height, String url,
                        double hitboxX, double hitboxY, double hitboxWidth, double hitboxHeight) {
        super(x, y, width, height, url, hitboxX, hitboxY, hitboxWidth, hitboxHeight);
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public abstract void move();
}
