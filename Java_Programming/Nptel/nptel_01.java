import java.util.Scanner;

public class nptel_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number % 2 == 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
        in.close();
    } 
    
}
