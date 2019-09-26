package Ex3_2;

public class Mer {
    private Bateau[] bateaux;

    public Mer (int nombreBateau) {
        bateaux = new Bateau[nombreBateau];
    }

    public void ajouteBateau(Bateau bateau) throws Exception {
        for (int i = 0; i < bateaux.length; i++) {
            if (bateaux[i] == null) {
                bateaux[i] = bateau;
                return;
            }
        }
        throw new Exception("Aucun bateau ne peut pas être ajoute");
    }

    public void coup(int x, int y) throws Exception {
        int coules = 0;
        boolean touche = false, coule = false;
        if (0 >= x || 10 < x || 0 >= y || 10 < y) {
            throw new Exception("Cette case n'esxiste pas");
        }
        for (Bateau b : bateaux) {
            if (b.attaque(x, y)) {
                touche = true;
                coule = b.coule();
            }
            coules += (b.coule()) ? 1 : 0;
        }
        System.out.print (touche ? "Touche" : "A l'eau");
        if (coule) {
            System.out.print(" Coule");
        }
        if (coules == bateaux.length) {
            System.out.print(" Gagne");
        }
        System.out.println();
    }
}
