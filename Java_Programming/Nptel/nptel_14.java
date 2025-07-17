import java.util.Scanner;

public class nptel_14 {
    static class Student{
    private String name;
    private int age;

public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}   
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());
        scanner.close();
    }
    
}
