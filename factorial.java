import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int count;
        long number;
        int factoriall = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number = input.nextInt();
        input.close();

        if (number < 0) {
            System.out.println("Please enter a non negative number");
        } else {
            for (count = 1; count <= number; count++) {
                factoriall *= count;
                System.out.println(factoriall);
            }
        }
    }
}