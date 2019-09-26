package Ex5_1;

public interface Point {
    double x();
    double y();
    double rho();
    double theta();
    void homeothetie(double k);
    void translation(double dx, double dy);
    void rotation(double a);
}
