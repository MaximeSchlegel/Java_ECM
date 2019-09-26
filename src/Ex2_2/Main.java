package Ex2_2;

public class Main {
    static public void main(String[] agrs){
        Batiment batiment1 = new Batiment(1, 3);
        Batiment batiment2 = new Batiment(2, 4);
        Batiment.metAlarme(true);
        Employe employe = new Employe(batiment1, 3);
        employe.aller(batiment2, 2);
        Batiment.metAlarme(false);
    }
}
