package Ex3_1;

public class Main {

    public static void main(String[] args) {
	    Chanson c1 = new Chanson("La javanaise", "J'avoue j'en ai bavé...", 2, 50);
	    Chanson c2 = new Chanson("La java des bombes atomiques", "Mon oncle un fameux bricoleur...", 3, 32);
	    Emission e1 = new Emission(15);
	    EmissionCommentee e2 = new EmissionCommentee(15);


	    try {
			e1.ajoute(c1);
			e1.ajoute(c2);
		} catch (Exception e) {
			System.out.println("Une musique n'a pas pu être ajouté");
		}
	    try {
			e2.ajoute(c1);
			e2.ajoute(c2);
			while (true) {
				e2.ajoute(c1);
			}
		} catch (Exception e) {
			System.out.println("Une musique n'a pas pu être ajouté");
		}

	    e1.passeTout();
		System.out.println();
	    e2.passeTout();
    }
}
