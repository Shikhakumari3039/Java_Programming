import java.util.Scanner;

public class nptel_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if (y == 0) {
            System.out.println("Error: Division by zero is not allowed.");
          }
          else {
        int quotient=x/y;
        int remainder=x%y;
        System.out.println("The Quotient is = " + quotient); 
        System.out.print("The Remainder is = " + remainder);
        }

sc.close();
sc.close();

    }
}
