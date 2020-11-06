import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int number;
        boolean prime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number = input.nextInt();
        input.close();

        if (number <= 1)
            System.out.println("Only numbers greater than 1 can be prime, please enter a different number");
        else {
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print("THIS NUMBER IS A PRIME NUMBER");
            } else {
                System.out.println("THIS NUMBER IS NOT A PRIME NUMBER");
            }
        }
    }
}
