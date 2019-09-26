package Projet.Vente;

public class Primeur extends Article implements VendreKilo {

    private float prixAuKilo;

    public Primeur(String nom, float prixAuKilo) {
        super(nom);
        this.prixAuKilo = prixAuKilo;
    }

    @Override
    public float vendre(float quantite) {
        return quantite * prixAuKilo;
    }

    @Override
    public float getPrixAuKilo() {
        return prixAuKilo;
    }
}
