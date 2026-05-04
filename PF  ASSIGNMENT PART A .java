import java.util.Scanner;

public class DecimalToBinaryA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int n = num;
        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println("Binary of " + num + " is: " + binary);
    }
}