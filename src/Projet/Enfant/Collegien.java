package Projet.Enfant;

public class Collegien extends Enfant implements Scolaire{

    private static String[] niveaux = {"6eme", "5eme", "4eme", "3eme"};

    private int niveau;
    private boolean examen;


    public Collegien(String nom, String prenom, int niveau) {
        super(nom, prenom);
        this.niveau = niveau;
        this.examen = false;
    }

    public Collegien(String nom, String prenom, String adresse, char sexe, int anneeNaissance, int deptNaissance, int niveau) {
        super(nom, prenom, adresse, sexe, anneeNaissance, deptNaissance);
        this.niveau = niveau;
        this.examen = false;
    }

    @Override
    public boolean petit() {
        return niveau == 0;
    }

    @Override
    public boolean moyen() {
        return niveau != 0 && niveau != niveaux.length -1;
    }

    @Override
    public boolean grand() {
        if (niveau == niveaux.length -1) {
            examen = true;
            return true;
        }
        return false;
    }
}
