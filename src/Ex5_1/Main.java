package Ex5_1;

public class Main {

    public static void main(String[] args) {
        PointCart pc = new PointCart(1,0,true);
        System.out.println(pc);
        pc.homeothetie(2);
        System.out.println(pc);
        pc.translation(-1,0);
        System.out.println(pc);
        pc.rotation(1.5);
        System.out.println(pc);

        System.out.println();

        PointPol pp = new PointPol(1,0,true);
        System.out.println(pp);
        pp.homeothetie(2);
        System.out.println(pp);
        pp.translation(-1,0);
        System.out.println(pp);
        pc.rotation(1.5);
        System.out.println(pp);
    }
}
