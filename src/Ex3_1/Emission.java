package Ex3_1;

import java.security.InvalidParameterException;

public class Emission {
    protected int dureeMin;
    protected Chanson[] playlist;

    public Emission(int dureeMin) {
        this.dureeMin = dureeMin;
        this.playlist = new Chanson[dureeMin / 2];
    }

    public void ajoute (Chanson chanson) {
        for (int i = 0; (i < dureeMin / 2) ; i++) {
            if (playlist[i] == null) {
                playlist[i] = chanson;
                return;
            }
        }
        throw new InvalidParameterException("L'emission ne peut plus passer de chanson");
    }

    public void passe(int i) {
        if ((0 <= i-1) && (i-1 < dureeMin / 2) && (playlist[i-1] != null)) {
            playlist[i-1].passe();
        } else {
            throw new InvalidParameterException("Pas de chanson disponible");
        }
    }

    public void passeTout() {
        int dureeTot = 0;
        for (int i = 1; (i-1 < dureeMin / 2) && (playlist[i-1] != null) && (dureeTot < dureeMin*60); i++ ) {
            passe(i);
            dureeTot += playlist[i-1].duree();
        }
    }

    public Chanson getChanson(int i) {
        return playlist[i];
    }
}
