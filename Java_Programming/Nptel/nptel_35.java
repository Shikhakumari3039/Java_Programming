import java.util.Scanner;

public class nptel_35 {
    public static String formatExpression(String input) {
        String output = input;
        output = output.replace("+", " Plus ");
        output = output.replace("-", " Minus ");
        output = output.replace("*", " Times ");
        output = output.replace("/", " Divided By ");
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(formatExpression(expression));
        sc.close();
    }
}
