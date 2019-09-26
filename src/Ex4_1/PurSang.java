package Ex4_1;

public final class PurSang extends Cheval {

    public PurSang(String nom) {
        super(nom);
        caract = "galope vite";
    }

    @Override
    public String toString() {
        return "PurSang : " + super.toString();
    }
}
