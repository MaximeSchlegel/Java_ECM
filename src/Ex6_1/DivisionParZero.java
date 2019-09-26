package Ex6_1;

public class DivisionParZero extends ArithmeticException {

    public DivisionParZero() {
        super("Impossible de diviser par 0");
    }
}
