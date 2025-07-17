import java.util.*;

public class nptel_07 {
    String name;
    int age;
    String grade;

    public nptel_07(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public nptel_07(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(!grade.isEmpty()||grade!=null) {
            System.out.print("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade= null;

        sc.nextLine();
        if(sc.hasNextLine())
        {
         grade =  sc.nextLine();
         }
        
        nptel_07 student;

if (grade == null ||grade.isEmpty()) {
    student = new nptel_07(name, age);
} else {
    student = new nptel_07(name, age, grade);  
}

student.displayInfo();

sc.close();

    }
}
