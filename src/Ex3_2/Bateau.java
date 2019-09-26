package Ex3_2;

import java.security.InvalidParameterException;

public abstract class Bateau {
    private int x;
    private int y;
    private boolean horizontal;
    private boolean[] touche;

    protected Bateau(int taille, int x, int y, boolean horizontal) {
        if ((x <= 0) || (y <= 0) || (horizontal && (x + taille >= 10)) || (!horizontal && (y + taille >= 10))) {
            throw new InvalidParameterException("le bateau e peut pas être place sur la grille");
        }
        this.x = x;
        this.y = y;
        this.horizontal = horizontal;
        touche = new boolean[taille];
    }

    public boolean attaque(int x, int y) {
        if (horizontal && this.y == y && this.x <= x && x <= this.x + touche.length) {
            touche[x - this.x] = true;
            return true;
        }
        if (!horizontal && this.x == x && this.y <= y && y <= this.y + touche.length) {
            touche[y - this.y] = true;
            return true;
        }
        return false;
    }

    public boolean coule () {
        for (boolean b : touche) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
