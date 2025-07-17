import java.util.Scanner;
public class nptel_05 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        int i,j;

        for(i=n; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=2; i<=n; i++){

            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
inr.close();
    }
}
