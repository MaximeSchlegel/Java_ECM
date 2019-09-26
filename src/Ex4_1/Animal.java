package Ex4_1;


public abstract class Animal {
    protected String cri;
    protected String caract;
    private String nom;

    Animal(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + "(cri= " + cri + " ; caracteristique="  + this.caract + ")";
    }
}

