package factorial;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Number you need for factorial: ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }
}
