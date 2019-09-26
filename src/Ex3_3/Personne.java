package Ex3_3;

import java.security.InvalidParameterException;

public class Personne {
    private static char[] numeroH = {'1', '3', '7'};
    private static char[] numeroF = {'2', '4', '8'};

    private String nom;
    private String prenom;
    private String adresse;
    private String numSecu;
    private char sexe;
    private int anneeNaissance;
    private int deptNaissance;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = "";
        this.adresse = "";
        this.sexe = 'N';
        this.anneeNaissance = 0;
        this.deptNaissance = 0;
    }

    public Personne(String nom, String prenom, String numSecu, String adresse) {
        if (numSecu.length() != 12) {
            throw new InvalidParameterException("numSec");
        }
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = numSecu;
        this.adresse = adresse;
        this.sexe();
        this.anneeNaissance();
        this.deptNaissance();
    }

    private void sexe() {
        if (!numSecu.isEmpty()) {
            for(int i = 0; i < numeroH.length; i++) {
                if (numSecu.charAt(0) == numeroH[i]) {
                    this.sexe = 'H';
                    return;
                }
                if (numSecu.charAt(0) == numeroF[i]) {
                    this.sexe = 'F';
                    return;
                }

            }
        }
    }

    private void anneeNaissance(){
        if (!numSecu.isEmpty()) {
            int aN = Integer.parseInt(this.numSecu.substring(1, 2));
            if (aN < 20) {
                this.anneeNaissance = 2000 + aN;
            } else {
                this.anneeNaissance = 1900 + aN;
            }
        }
    }

    private void deptNaissance(){
        if (!numSecu.isEmpty()) {
            this.deptNaissance = Integer.parseInt(this.numSecu.substring(4,5));
        }
    }

    public int calculAge(){
        return 2020 - this.anneeNaissance;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        if (!this.nom.isEmpty()) {
            ret.append("Nom : "); ret.append(this.nom); ret.append("\n");
        }
        if (!this.prenom.isEmpty()) {
            ret.append("Prenom : "); ret.append(this.prenom); ret.append("\n");
        }
        if (!this.numSecu.isEmpty()) {
            ret.append("Numero de securite sociale : "); ret.append(this.numSecu); ret.append("\n");
        }
        if (!this.adresse.isEmpty()) {
            ret.append("Adresse : "); ret.append(this.adresse); ret.append("\n");
        }
        if (this.sexe != 'N') {
            ret.append("Sexe : "); ret.append(this.sexe); ret.append("\n");
        }
        if (this.anneeNaissance > 0) {
            ret.append("Annee de naissance : "); ret.append(this.anneeNaissance); ret.append("\n");
        }
        if (this.deptNaissance > 0) {
            ret.append("Department de naissance : "); ret.append(this.deptNaissance); ret.append("\n");
        }
        return ret.toString();
    }
}
