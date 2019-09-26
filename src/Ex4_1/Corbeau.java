package Ex4_1;

public final class Corbeau extends Oiseau {

    public Corbeau(String nom) {
        super(nom);
        cri = "croasse";
    }

    @Override
    public String toString() {
        return "Corbeau : " + super.toString();
    }
}
