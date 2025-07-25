import java.util.Scanner;

public class nptel_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two numeric values
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // Read the operator (e.g., '+', '-', '*', '/')
        char op = sc.next().charAt(0);
System.out.println(operate(a, b, op)); 
sc.close();
    }

    // Helper method to perform basic arithmetic operations
    public static double operate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0.0;
        }
    }
}
