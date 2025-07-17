import java.util.Scanner;

class QuestionScope {
    int sum(int a, int b){
        return a+b;
    }
    static int mul(int a, int b){
        return a*b;
    }    
}
public class nptel_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        QuestionScope st= new QuestionScope();
        int result1= st.sum(n1, n2);
        int result2 =QuestionScope.mul(n1,n2);
        System.out.println(result1);
        System.out.print(result2);
        sc.close();
    }
}
