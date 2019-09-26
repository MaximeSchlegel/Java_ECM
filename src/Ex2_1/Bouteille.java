package Ex2_1;

import java.security.InvalidParameterException;

public class Bouteille {

    private int quantite;
    private boolean estouverte;

    public Bouteille(int quantite) {
        this.quantite = quantite;
    }

    public void ouvrir() {
        this.estouverte = true;
    }

    public void fermer(){
        this.estouverte = false;
    }

    public void verseDans(Verre verre, int cl) {
        if (this.estouverte && this.quantite > cl) {
            verre.remplir(cl);
            this.quantite -= cl;
        } else {
            if (!this.estouverte) {
                throw new InvalidParameterException("La bouteille est fermée");
            } else {
              verre.remplir(this.quantite);
              this.quantite = 0;
            }
        }
    }

    public void affiche() {
        System.out.println("Bouteille : ouverte=" + this.estouverte + " ; quantite=" + this.quantite);
    }
}
