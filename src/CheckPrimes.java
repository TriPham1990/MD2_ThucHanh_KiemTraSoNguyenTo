import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not Primes!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % 2 == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a Primes!");
            } else {
                System.out.println(number + " is not Primes!");
            }
        }
    }
}
