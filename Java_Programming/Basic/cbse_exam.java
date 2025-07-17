import java.util.Scanner;

public class cbse_exam {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Physics marks: ");
        int physics = in.nextInt();

        System.out.println("Enter your English marks: ");
        int english = in.nextInt();

        System.out.println("Enter your Chemistry marks: ");
        int chemistry = in.nextInt();

        System.out.println("Enter your Mathematics marks: ");
        int mathematics = in.nextInt();

        System.out.println("Enter your Computer Science marks: ");
        int computer = in.nextInt();

        float percentage = ((physics + english + chemistry + mathematics + computer) / 500.0f) * 100;

        System.out.println("Percentage: " + percentage + "%");

        in.close();
    }
}
