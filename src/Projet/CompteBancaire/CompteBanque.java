package Projet.CompteBancaire;

import Projet.Personne.Personne;

import java.security.InvalidParameterException;

public class CompteBanque {
    private String num;
    private Personne client;
    private float solde;
    private float decouvertAutorise;
    private String code1;
    private String code2;

    public CompteBanque (String num, Personne client, String code1, String code2) {
        this.num = num;
        this.client = client;
        this.code1 = code1;
        this.code2 = code2;
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    public String getNum() {
        return num;
    }

    public Personne getClient() {
        return client;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float newSolde, String code1) throws CodeInvalideException {
        if (!this.code1.equals(code1)) {
            throw new CodeInvalideException();
        }
        this.solde = newSolde;
    }

    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(float newDecouvertAutorise, String code2) throws CodeInvalideException {
        if (!this.code2.equals(code2)) {
            throw new CodeInvalideException();
        }
        this.decouvertAutorise = newDecouvertAutorise;
    }

    public void versement(float somme, String code) throws Exception {
        if(!code1.equals(code)) {
            throw new CodeInvalideException();
        }
        if(somme < 0) {
            throw new InvalidParameterException("Somme doit être positif");
        }
        this.solde += somme;
    }

    public void retrait(float somme, String code) throws Exception {
        if (!code1.equals(code)) {
            throw new CodeInvalideException();
        }
        if (somme < 0) {
            throw new InvalidParameterException("Somme doit être positive");
        }
        if (somme > solde && somme - solde >= decouvertAutorise) {
            throw new Exception("Operation invalide");
        }
        solde -= somme;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Compte de : ");
        ret.append(client.getNom());
        ret.append(" ");
        ret.append(client.getPrenom());
        ret.append("\n  -Solde : ");
        ret.append(solde);
        ret.append("\n  -Decouvert Autorise : ");
        ret.append(decouvertAutorise);
        return ret.toString();
    }
}
