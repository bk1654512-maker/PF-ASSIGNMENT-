import java.util.Scanner;

public class DecimalToBinaryB {

    public static int[] toBinaryArray(int num) {
        int n = num;
        int[] temp = new int[32]; // max size
        int i = 0;

        while (n > 0) {
            temp[i] = n % 2;
            n = n / 2;
            i++;
        }

        int[] result = new int[i];
        int index = 0;

        for (int j = i - 1; j >= 0; j--) {
            result[index++] = temp[j];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int[] binaryArray = toBinaryArray(num);

        System.out.print("Binary: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
    }
}