package Ex2_2;

public class Bureau {
    private int numero;
    private boolean ouvert;

    public Bureau(int numero) {
        this.numero = numero;
    }

    public boolean isOuvert() {
        if (Batiment.alarmeTriggered()) {
            return false;
        }
        return this.ouvert;
    }

    public void ouvrir() {
        this.ouvert = true;
        if (Batiment.alarmeTriggered()) {
            System.out.println("ALARME !!!!");
        }
    }

    public void fermer() {
        this.ouvert = false;
    }

    public int getNumero() {
        return numero;
    }
}
