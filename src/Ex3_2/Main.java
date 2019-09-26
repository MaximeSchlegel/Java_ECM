package Ex3_2;

public class Main {
    static public void main (String args[]) throws Exception {
        Mer mer = new Mer(2); // 2 bateaux à couler
        // place un torpilleur horizontalement en (1,1) :
        mer.ajouteBateau(new Torpilleur(1, 1, true));
        // place un cuirassé verticalement en (3,2) :
        mer.ajouteBateau(new Cuirasse(3, 2, false));
        mer.coup(10,10);	// affiche : A l’eau
        mer.coup(1,1); 	// affiche : Touché
        mer.coup(2,1); 	// affiche : Touché Coulé
        mer.coup(3,2); 	// affiche : Touché
        mer.coup(3,3); 	// affiche : Touché
        mer.coup(3,4); 	// affiche : Touché Coulé Gagné
    }
}
