import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        double a, b,hypotenuse, area, perimetre;
        ///////  90° Triangle

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side of 90° triangle type in centimetre: ");
        a = input.nextInt();
        System.out.println(a + " cm");

        System.out.print("Enter second side of 90° triangle type in centimetre: ");
        b = input.nextInt();
        System.out.println(b + " cm");

        hypotenuse = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse of triangle: " + hypotenuse + " cm");

        perimetre = a + b + hypotenuse;
        System.out.println("Perimetre of triangle: " + perimetre + " cm");

        area = (a * b) / 2;
        System.out.println("Area of 90° triangle: " + area + " square cm");


        /////// Triangle

        double e, f, g, u, ar;
        System.out.print("Enter first side of triangle type in centimetre: ");
        e = input.nextInt();
        System.out.println(a + " cm");

        System.out.print("Enter second side of triangle type in centimetre: ");
        f = input.nextInt();
        System.out.println(b + " cm");


        System.out.print("Enter third side of triangle type in centimetre: ");
        g = input.nextInt();
        System.out.println(b + " cm");

        u = (e + f + g ) / 2;
        ar = Math.sqrt((u * (u - e)  * (u - f)  * (u - g)));
        System.out.println("Area of triangle: " + ar + " square cm");
    }
}
