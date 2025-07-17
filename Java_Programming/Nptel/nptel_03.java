import java.util.Scanner;

public class nptel_03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

            int number = in.nextInt();

            System.out.println("table" + number + ":");
            for(int i=1; i<=10; i++){
                System.out.println(number + "*" + i + "=" + (number*i));
            }
            in.close();
    }  
}
