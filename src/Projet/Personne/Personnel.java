package Projet.Personne;

import java.util.Date;

public abstract class Personnel extends Personne {

    private Date dateEntre;
    private float tempsDeTravail;

    public Personnel(String nom, String prenom, Date dateEntre, float tempsDeTravail) {
        super(nom, prenom);
        this.dateEntre = dateEntre;
        this.tempsDeTravail = tempsDeTravail;
    }

    public Personnel(String nom, String prenom, String adresse, String numSec, Date dateEntre, float tempsDeTravail) {
        super(nom, prenom, adresse, numSec);
        this.dateEntre = dateEntre;
        this.tempsDeTravail = tempsDeTravail;
    }

    public abstract float calculSalaire();
}
