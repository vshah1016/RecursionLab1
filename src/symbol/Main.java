package symbol;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private static void printAsterisk(int n) {
        printAsterisk(1, n);
    }

    private static void printAsterisk(int i, int n) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
        if (i < n) {
            i++;
            printAsterisk(i, n);
        }
    }

    public static void main(String[] args) {
        System.out.print("Number you want to repeat the symbol: ");
        int input = scanner.nextInt();
        printAsterisk(input);
    }
}
