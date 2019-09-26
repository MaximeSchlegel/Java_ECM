package Ex5_1;

public class PointCart implements Point {
    private double x, y;

    PointCart(double d1, double d2, boolean iscartesianCoord) {
        if (iscartesianCoord) {
            x = d1;
            y = d2;
        } else {
            x = d1 * Math.cos(d2);
            y = d1 * Math.sin(d2);
            //x = Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
            //y = Math.atan2(d1, d2);
        }
    }

    @Override
    public double x() {
        return x;
    }

    @Override
    public double y() {
        return y;
    }

    @Override
    public double rho() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public double theta() {
        return Math.atan2(x, y);
    }

    @Override
    public void homeothetie(double k) {
        x *= k;
        y *= k;
    }

    @Override
    public void translation(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void rotation(double a) {
        PointPol p = new PointPol(x, y, false);
        p.rotation(a);
        x = p.x();
        y = p.y();
    }

    @Override
    public String toString() {
        return "(x: " + x + ", y: " + y + ")";
    }
}
