import java.util.Scanner;

public class nptel_34 {
    public static String extractDigits(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
System.out.println(extractDigits(input));
sc.close();
    }
}
