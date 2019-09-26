package Projet.Vente;

public interface Solde {

    void mettreEnsolde(int remise) throws Exception;
    int getRemise();
    float getPrixSolde();
    void retirerDesSoldes();
}
