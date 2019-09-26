package Projet.Enfant;

public class Enfant {
    private String nom;
    private String prenom;
    private String adresse;
    private char sexe;
    private int anneeNaissance;
    private int deptNaissance;

    protected Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    protected Enfant(String nom, String prenom, String adresse, char sexe, int anneeNaissance, int deptNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.sexe = sexe;
        this.anneeNaissance = anneeNaissance;
        this.deptNaissance = deptNaissance;
    }


}
