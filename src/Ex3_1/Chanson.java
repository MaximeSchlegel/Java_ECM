package Ex3_1;

public class Chanson {
    private String titre;
    private String texte;
    private int dureeMin;
    private int dureeSec;

    public Chanson(String titre, String texte, int dureeMin, int dureeSec) {
        this.titre = titre;
        this.texte = texte;
        this.dureeMin = dureeMin;
        this.dureeSec = dureeSec;
    }

    public void passe() {
        System.out.println(texte);
    }

    public int duree(){
        return 60*dureeMin + dureeSec;
    }

    public String getTitre() {
        return titre;
    }
}
