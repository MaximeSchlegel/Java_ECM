package Projet.Personne;

import Projet.Personne.Personne;

public class Eleve extends Personne {
    private String ine;
    private String promo;
    private int annee;

    public Eleve(String nom, String prenom, String ine, String promo, int annee) {
        super(nom, prenom);
        this.ine = ine;
        this.promo = promo;
        this.annee = annee;
    }

    public Eleve(String nom, String prenom, String adresse, String numSec, String ine, String promo, int annee) {
        super(nom, prenom, adresse, numSec);
        this.ine = ine;
        this.promo = promo;
        this.annee = annee;
    }

    public String getIne() {
        return ine;
    }

    public String getPromo() {
        return promo;
    }

    public int getAnnee() {
        return annee;
    }
}
