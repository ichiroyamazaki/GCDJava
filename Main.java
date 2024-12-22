import java.util.Scanner;

public class Main {
    // Method to calculate the GCD using the Euclidean algorithm
    public static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return GCD(n2, n1 % n2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int n2 = input.nextInt();

        int result = GCD (n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + result);
    }
}
