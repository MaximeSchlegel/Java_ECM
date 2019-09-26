package Ex4_1;

public final class Pigeon extends Oiseau {

    public Pigeon(String nom) {
        super(nom);
        cri = "roucoule";
    }

    @Override
    public String toString() {
        return "Pigeon : " + super.toString();
    }
}
