package factorial;

public class Main {

    private static int factorial(int n){
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // TODO: shivamratnani04@gmail.com you need to implement scanner here. Replace line 12 with input from user, and assign to variable input
        int input = 6;
        System.out.println(factorial(input));
    }
}
