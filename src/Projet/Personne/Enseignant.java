package Projet.Personne;

import java.util.Date;

public class Enseignant extends Personnel {

    private static String[] echelon = {"PROF", "MDC", "PRAG"};
    private static float[] salaireFixe = {1, 2, 3};
    private static int[] heure = {192/2, 192, 192*2};
    private static float prime = 500;
    private static float tauxHeureSup = 50;

    private int rang;
    private int heureFaite;
    private int heureMission;
    private int heureSup;


    public Enseignant(String nom, String prenom, Date dateEntre, float tempsDeTravail, int rang) {
        super(nom, prenom, dateEntre, tempsDeTravail);
        this.rang = rang;
        this.heureFaite = 0;
        this.heureMission = 0;
        this.heureSup = 0;
    }

    public Enseignant(String nom, String prenom, String adresse, String numSec, Date dateEntre, float tempsDeTravail, int rang) {
        super(nom, prenom, adresse, numSec, dateEntre, tempsDeTravail);
        this.rang = rang;
        this.heureFaite = 0;
        this.heureMission = 0;
        this.heureSup = 0;
    }

    public void addHeure(int h) {
        heureFaite += h;
    }

    public void resetHeure() {
        heureFaite = 0;
    }

    public void addHeureSup(int h) {
        heureSup += h;
    }

    public void resetHeureSup() {
        heureSup = 0;
    }

    public void addHeureMission(int h) {
        heureMission += h;
    }

    public void resetHeureMission() {
        heureMission = 0;
    }

    @Override
    public float calculSalaire() {
        float salaire = salaireFixe[rang];
        if (heureFaite + heureMission >= heure[rang]) {
            salaire += prime;
        }
        salaire += tauxHeureSup * tauxHeureSup;
        return salaire;
    }
}
