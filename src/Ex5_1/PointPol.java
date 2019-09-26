package Ex5_1;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class PointPol implements Point {
    private double rho, theta;

    public PointPol(double d1, double d2, boolean isPolarCoord) {
        if(isPolarCoord) {
            rho = d1;
            theta = d2;
        } else {
            rho = Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
            theta = Math.atan2(d1, d2);
        }
    }

    @Override
    public double x() {
        return rho * Math.cos(theta);
    }

    @Override
    public double y() {
        return rho * Math.sin(theta);
    }

    @Override
    public double rho() {
        return rho;
    }

    @Override
    public double theta() {
        return theta;
    }

    @Override
    public void homeothetie(double k) {
        rho = rho*k;
    }

    @Override
    public void translation(double dx, double dy) {
        PointCart p = new PointCart(rho, theta, false);
        p.translation(dx, dy);
        rho = p.rho();
        theta = p.theta();
    }

    @Override
    public void rotation(double a) {
        theta += a;
    }

    @Override
    public String toString() {
        return "(rho: " + rho + ", theta: " + theta + ")";
    }
}
