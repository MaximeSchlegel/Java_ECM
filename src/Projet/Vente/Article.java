package Projet.Vente;

public class Article implements Publicite {

    private String nom;

    public Article(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public void faireDeLaPub() {
        System.out.println("Acheter notre super article : " + nom + " !");
    }
}
