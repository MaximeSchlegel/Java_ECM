package Ex4_1;

public class Cheval extends Animal {

    public Cheval(String nom) {
        super(nom);
        cri = "henit";
        caract = "galope";
    }

    @Override
    public String toString() {
        return "Cheval : " + super.toString();
    }
}
