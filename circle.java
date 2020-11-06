import java.util.Scanner;

public class circle {
    public static void circumference() {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextInt();
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + area);
    }

    public static void main(String[] args) {
        circumference();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius1 = input.nextInt();
        System.out.println("The perimeter of the circle is: " + radius1 * 2 * Math.PI);
        input.close();
    }
}