import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int divisor = 4;
        int divisor1 = 100;
        int divisor2 = 400;
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        year = input.nextInt();
        input.close();

//divisible by 400 or (divisible by 4 and not 100)
        if (year % divisor == 0 && year % divisor1 != 0) {
            System.out.println("This year is a leap year");

            if (year % divisor2 == 0) {
                System.out.println("This year is a leap year");
            }
            if (year == 1800 || year == 1900) {
                System.out.println("This year is not a leap year");
            }
        }else {
                System.out.println("This year is not a leap year");

        }
    }
}