package symbol;

public class Main {
    private static void printAsterisk(int n){
        printAsterisk(1, n);
    }

    private static void printAsterisk(int i, int n){
        // Print a line of i amount of asterisks
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

        // TODO: shivamratnani04@gmail.com you need to implement scanner here. Replace line 24 with input from user, and assign to variable input
        int input = 15;

        printAsterisk(input);
    }
}
