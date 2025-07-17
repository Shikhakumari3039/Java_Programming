import java.util.*;
class student {
    String name;
    int age;
    String grade;
    public student(String name, int age, String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void displayInfo(){
        System.out.println("student name: " + name);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade);
    }
}
public class nptel_06 {
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String name = sc.nextLine();
    int age = sc.nextInt(); 
    String grade = sc.next();
    student student = new student(name, age, grade);
    student.displayInfo();
    sc.close();
   }
}
