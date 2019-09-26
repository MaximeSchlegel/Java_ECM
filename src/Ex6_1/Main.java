package Ex6_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;
        float z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x : ");
        x = scan.nextInt();
        System.out.print("Enter y : ");
        y = scan.nextInt();
        try {
            if (y != 0) {
                z = x / y;
            } else {
                throw new DivisionParZero();
            }
        } catch (DivisionParZero e) {
            System.out.println("Exception division par zero");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}
