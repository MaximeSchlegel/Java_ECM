package Projet.Personne;

import java.security.InvalidParameterException;
import java.util.Calendar;

public class Personne {
    private String nom;
    private String prenom;
    private String numSecu;
    private String adresse;
    private char sexe;
    private int anneeNaissance;
    private int deptNaissance;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = new String();
        this.numSecu = new String();
        this.sexe = '\u0000';
        this.anneeNaissance = -1;
        this.deptNaissance = -1;
    }

    public Personne(String nom, String prenom, String adresse, String numSecu) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        if(!numSecTest(numSecu)) {
            throw new InvalidParameterException("Invalid NumSecu");
        }
        this.numSecu = numSecu;
        try{
            this.sexe = sexe();
        } catch (Exception e) {
            throw new InvalidParameterException("Invalid NumSecu");
        }
        this.anneeNaissance = anneeNaissance();
        this.deptNaissance = deptNaissance();
    }

    private boolean numSecTest(String numSec) {
        if (numSec.length() != 13) {
            return false;
        }
        char c;
        for (int j = 0; j < numSec.length(); j++) {
            c = numSec.charAt(j);
            if (!('0' <= c && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private int anneeNaissance() {
        int annee = Integer.parseInt(numSecu.substring(1,3));
        if (annee < Calendar.getInstance().get(Calendar.YEAR) % 100) {
            return Calendar.getInstance().get(Calendar.YEAR) - (Calendar.getInstance().get(Calendar.YEAR) % 100) + annee;
        } else {
            return Calendar.getInstance().get(Calendar.YEAR) - (Calendar.getInstance().get(Calendar.YEAR) % 100) + annee - 100;
        }
    }

    private char sexe() throws Exception{
        int sexe = Integer.parseInt(numSecu.substring(0,1));
        if(sexe == 1 || sexe == 3 || sexe == 7) {
            return 'H';
        }
        if (sexe == 2 || sexe == 4 || sexe == 8) {
            return 'F';
        }
        throw new Exception("Invalid sexe identifier");
    }

    private int deptNaissance() {
        return Integer.parseInt(numSecu.substring(6,8));
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        String backup = this.numSecu;
        this.numSecu = numSecu;
        try {
            this.sexe = sexe();
        } catch (Exception e) {
            this.numSecu = backup;
            throw new InvalidParameterException("NumSec invalide");
        }
        this.anneeNaissance = anneeNaissance();
        this.deptNaissance = deptNaissance();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public char getSexe() {
        return sexe;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public int getDeptNaissance() {
        return deptNaissance;
    }

    public int calculeAge() throws Exception {
        if (anneeNaissance != -1) {
            return Calendar.getInstance().get(Calendar.YEAR) - anneeNaissance;
        }
        throw new Exception("Can not compute the age");
    }
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Nom: ");
        ret.append(nom);
        ret.append(" - Prenom: ");
        ret.append(prenom);

        ret.append(" [");
        if(!numSecu.isEmpty()) {
            ret.append("NumSecu: ");
            ret.append(numSecu);
        }
        if(sexe != '\u0000') {
            ret.append(" - Sexe: ");
            ret.append(sexe);
        }
        if(anneeNaissance != -1) {
            ret.append(" - AnneNaissance: ");
            ret.append(anneeNaissance);
        }
        if(deptNaissance != -1) {
            ret.append(" - DeptNaissance: ");
            ret.append(deptNaissance);
        }
        ret.append("]");

        if (!adresse.isEmpty()) {
            ret.append(" - Adresse:");
            ret.append(adresse);
        }

        return ret.toString();
    }
}
