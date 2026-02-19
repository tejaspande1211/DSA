import java.util.Scanner;

public class HCFProgram {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate HCF
        int hcf = findHCF(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    /**
     * Calculates the HCF (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The HCF of a and b.
     */
    public static int findHCF(int a, int b) {
        // The algorithm works with absolute values for positive results
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b; // New 'b' is the remainder
            a = temp;  // New 'a' is the old 'b'
        }
        // When b becomes 0, a is the HCF
        return a;
    }
}
