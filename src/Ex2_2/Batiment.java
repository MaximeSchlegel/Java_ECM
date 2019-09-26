package Ex2_2;

import java.security.InvalidParameterException;

public class Batiment {
    private int numero;
    private Bureau[] bureaux;
    static private boolean alarme = false;

    public Batiment(int numero, int nombreDeBureau) {
        this.numero = numero;
        this.bureaux = new Bureau[nombreDeBureau];
        for(int i = 0; i < nombreDeBureau; i++) {
            bureaux[i] = new Bureau(i+1);
        }
    }

    public boolean exist(int bureau) {
        return (0 < bureau) && (bureau <= bureaux.length);
    }

    public Bureau getBureaux(int bureau) {
        if (!this.exist(bureau)) {
            throw new InvalidParameterException("Ce bureau n'existe pas");
        }
        return this.bureaux[bureau-1];
    }

    public int getNumero() {
        return this.numero;
    }

    static public void metAlarme(boolean status) {
        alarme = status;
        System.out.println("Alarme " + ((status) ? "activée" : "desactivée"));
    }

    static public boolean alarmeTriggered() {
        return alarme;
    }
}
