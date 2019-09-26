package Projet.Personne;

import java.util.Date;

public class IATOS extends Personnel {

    private float salaireFixe;
    private float tauxHeuresSup;
    private int heuresSupMensuelles;

    public IATOS(String nom, String prenom, Date dateEntre, float tempsDeTravail, float salaireFixe, float tauxHeuresSup) {
        super(nom, prenom, dateEntre, tempsDeTravail);
        this.salaireFixe = salaireFixe;
        this.tauxHeuresSup = tauxHeuresSup;
    }

    public IATOS(String nom, String prenom, String adresse, String numSec, Date dateEntre, float tempsDeTravail, float salaireFixe, float tauxHeuresSup) {
        super(nom, prenom, adresse, numSec, dateEntre, tempsDeTravail);
        this.salaireFixe = salaireFixe;
        this.tauxHeuresSup = tauxHeuresSup;
    }

    public void addHeureSup(int h) {
        heuresSupMensuelles += h;
    }

    public void resetHeureSup() {
        heuresSupMensuelles = 0;
    }

    public float calculSalaire() {
        return salaireFixe + (float) heuresSupMensuelles * tauxHeuresSup;
    }
}
