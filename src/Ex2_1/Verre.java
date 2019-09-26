package Ex2_1;

public class Verre {
    private int contenance, quantite;

    public Verre(int contenace) {
        this.contenance = contenace;
    }

    public void boire(int cl) {
        int delta = this.quantite - cl;
        this.quantite = (delta > 0) ? delta : 0;
    }

    public void remplir(int cl) {
        int somme = this.quantite + cl;
        this.quantite = (somme < contenance) ? somme : this.contenance;
    }

    public void afficher() {
        System.out.println("Verre : quantité=" + this.quantite + " ; contenance=" + this.contenance);
    }
}
