

public class lec_12 {
    // public static void main(String[] args) {
    //     float a = 7/4.0f * 9/2.0f;
    //     System.out.println(a);
    // }

    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
