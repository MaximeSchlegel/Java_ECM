package Ex4_1;

public class Main {

    public static void main(String[] args) {
        Animal[] liste = new Animal[6];
        liste[0] = new Chien("Medor");
        liste[1] = new Cheval("Trotro");
        liste[2] = new PurSang("CrinBlanc");
        liste[3] = new Pigeon("Pigeon");
        liste[4] = new Corbeau("Corbeau");
        liste[5] = new Rosignol("Rosignol");

        for(Animal a : liste) {
            System.out.println(a);
        }

    }
}
