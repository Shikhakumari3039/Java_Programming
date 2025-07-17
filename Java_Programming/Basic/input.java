
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the integer:");
        int a = in.nextInt();

        System.out.println("Enter the float:");
        float b = in.nextFloat();

        in.nextLine(); // Clear the newline left by nextFloat()

        System.out.println("Enter the string:");
        String c = in.nextLine();

        System.out.println("Enter the double:");
        double d = in.nextDouble();

        System.out.println("Enter the character:");
        char e = in.next().charAt(0);

        // Output values
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("String: " + c);
        System.out.println("Double: " + d);
        System.out.println("Character: " + e);

        in.close();
    }
}
