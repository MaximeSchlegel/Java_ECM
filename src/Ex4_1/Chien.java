package Ex4_1;

public class Chien extends Animal {

    public Chien(String nom) {
        super(nom);
        cri = "aboie";
        caract = "fidèle";
    }

    @Override
    public String toString() {
        return "Chien : " + super.toString();
    }
}
