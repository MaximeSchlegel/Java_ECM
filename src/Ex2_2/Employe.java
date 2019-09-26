package Ex2_2;

import java.security.InvalidParameterException;

public class Employe {
    private Batiment batiment;
    private int bureau;

    public Employe(Batiment batiment, int bureau) {
        if (!batiment.exist(bureau)) {
            throw new InvalidParameterException("Ce bureau n'existe pas");
        }
        this.batiment = batiment;
        this.bureau = bureau;
    }

    public void aller(Batiment batiment, int bureau) {
        Bureau current = this.batiment.getBureaux(this.bureau), target = batiment.getBureaux(bureau);

        if (!current.isOuvert()) {
            current.ouvrir();
            System.out.println("Ouverture du bureau n°" + this.batiment.getNumero() + ":" + current.getNumero());
        }

        current.fermer();
        System.out.println("Fermeture du bureau n°" + this.batiment.getNumero() + ":" + current.getNumero());

        if(this.batiment.getNumero() != batiment.getNumero()) {
            System.out.println("Deplacement du batiment n°" + this.batiment.getNumero() + " vers le batiment n°" + batiment.getNumero());
        }

        if (!target.isOuvert()) {
            target.ouvrir();
            System.out.println("Ouverture du bureau n°" + batiment.getNumero() + ":" + target.getNumero());
        }

        this.batiment = batiment;
        this.bureau = bureau;
    }
}
