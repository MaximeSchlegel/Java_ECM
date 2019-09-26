package Projet.Vente;

public class Electromenager extends Article implements VendrePiece, Publicite, Solde {

    private float prixUnitaire;
    private int remise;

    public Electromenager(String nom, float prixUnitaire) {
        super(nom);
        this.prixUnitaire = prixUnitaire;
        this.remise = 0;
    }

    @Override
    public void mettreEnsolde(int remise) throws Exception {
        if (remise < 0 || 100 < remise) {
            throw new PasEntre0Et100Exception();
        }
        this.remise = remise;
    }

    @Override
    public int getRemise() {
        return remise;
    }

    @Override
    public float getPrixSolde() {
        return prixUnitaire * (1 - (float) remise / 100);
    }

    @Override
    public void retirerDesSoldes() {
        remise = 0;
    }

    @Override
    public float vendre(int piece) {
        return piece * getPrixSolde();
    }

    @Override
    public float getPrixUnitaire() {
        return prixUnitaire;
    }
}
