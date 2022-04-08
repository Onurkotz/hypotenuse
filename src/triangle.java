import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        double a, b,hypotenuse, area, perimetre;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side of triangle type in centimetre: ");
        a = input.nextInt();
        System.out.println(a + " cm");

        System.out.print("Enter second side of triangle type in centimetre: ");
        b = input.nextInt();
        System.out.println(b + " cm");

        hypotenuse = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse of triangle: " + hypotenuse + " cm");

        perimetre = a + b + hypotenuse;
        System.out.println("Perimetre of triangle: " + perimetre + " cm");

        area = (a * b) / 2;
        System.out.println("Area of triangle: " + area + " square cm");

    }
}
