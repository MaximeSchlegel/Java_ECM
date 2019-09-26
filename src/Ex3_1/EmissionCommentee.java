package Ex3_1;

import java.security.InvalidParameterException;

public class EmissionCommentee extends Emission {

    public EmissionCommentee(int DureeMin) {
        super(DureeMin);
    }

    @Override
    public void passe(int i) {
        if ((0 <= i-1) && (i-1 < dureeMin / 2) && (playlist[i-1] != null)) {
            System.out.println("Now playing : " + playlist[i-1].getTitre());
            playlist[i-1].passe();
        } else {
            throw new InvalidParameterException("Pas de chanson disponible");
        }
    }

    @Override
    public void passeTout() {
        System.out.println("Bonjour !");
        super.passeTout();
        System.out.println("Au revoir");
    }
}
