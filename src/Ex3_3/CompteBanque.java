package Ex3_3;

public class CompteBanque {
    private String num;
    private Personne client;
    private float solde;
    private float decouvertAutorise;
    private String code1;
    private String code2;

    public CompteBanque(String num, Personne client, String code1, String code2) {
        this.num = num;
        this.client = client;
        this.code1 = code1;
        this.code2 = code2;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Personne getClient() {
        return client;
    }

    public void setClient(Personne client) {
        this.client = client;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde, String code1) {
        if (this.code1 == code1) {
            this.solde = solde;
        }
    }

    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(float decouvertAutorise, String code2) {
        if (this.code2 == code2) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
