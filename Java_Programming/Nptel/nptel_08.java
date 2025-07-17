import java.util.*;
public class nptel_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();
        int breadth = sc.nextInt();

        class reactangle{
            int length, breadth;

            reactangle(int lenght, int breadth){
                this.length=lenght;
                this.breadth=breadth;
            }
            int area(){
                return length * breadth;
            }
        }
        reactangle r = new reactangle(lenght, breadth);
        System.out.println(r.area());

        sc.close();
    }
    
}
