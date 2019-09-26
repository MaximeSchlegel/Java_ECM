package Ex2_1;

public class Main {

    public static void main(String[] args) {
        Bouteille orange = new Bouteille(100), citron = new Bouteille(100);
        Verre verre = new Verre(20);
        citron.affiche();orange.affiche();verre.afficher();
        System.out.println();

        citron.ouvrir();
        citron.verseDans(verre, 8);
        citron.affiche();

        orange.ouvrir();
        orange.verseDans(verre, 12);
        orange.affiche();

        verre.afficher();
        System.out.println();

        verre.boire(20);
        verre.afficher();
        System.out.println("Done");
    }
}
