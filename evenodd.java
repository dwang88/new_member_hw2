import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number%2 == 0) {
            System.out.print("This number is ever");
        }
        else {
            System.out.print("This number is odd");
        }

        input.close();
    }
}
