import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int c = 0;
        boolean valid = true;

        switch (op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                if (b != 0) {
                    c = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                valid = false;
        }

        if (valid) {
            System.out.println("The final result: " + c);
        }

        sc.close();
    }
}
