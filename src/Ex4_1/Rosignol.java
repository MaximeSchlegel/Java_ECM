package Ex4_1;

public final class Rosignol extends Oiseau {

    public Rosignol(String nom) {
        super(nom);
        cri = "chante";
    }

    @Override
    public String toString() {
        return "Rosignol : " + super.toString();
    }
}
