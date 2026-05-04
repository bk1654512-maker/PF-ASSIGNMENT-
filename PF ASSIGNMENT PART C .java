import java.util.Scanner;

public class DecimalToBinaryC {

    public static String toBinaryString(int num) {
        int n = num;
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        String result = toBinaryString(num);

        System.out.println("Binary: " + result);
    }
}