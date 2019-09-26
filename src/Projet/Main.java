package Projet;

import Projet.CompteBancaire.CompteBanque;
import Projet.Personne.Personne;

public class Main {

    public static void main(String[] args) {
        Personne p1 = new Personne("Mario", "Bros");
        System.out.println(p1);

        CompteBanque c1 = new CompteBanque("001", p1, "c1", "c2");
        System.out.println(c1);

        try {
            c1.versement(100, "c1");
        } catch (Exception e) {
            System.out.println("Le versement n'a pas pu être effectué : " + e.getMessage());
        }
        System.out.println(c1);

        try {
            c1.setDecouvertAutorise(100, "c2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            c1.retrait(150, "c1");
        } catch (Exception e) {
            System.out.println("Le retrait n'a pas pu être effectué : " + e.getMessage());
        }
        System.out.println(c1);

        Personne p2 = new Personne("Luigi", "Bros", "Royaume Champignon", "1234567891234");
        System.out.println(p2);

        Personne p3 = new Personne("Wario", "Bros", "Royaume Champignon", "1104568391234");
        System.out.println(p3);
    }
}
