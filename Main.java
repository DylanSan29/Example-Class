import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student student;
        String name;
        int age;
        long telephone;
        float average;
        char gender;
        System.out.println("Registering student");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Telephone: ");
        telephone = sc.nextLong();
        System.out.print("Average: ");
        average = sc.nextFloat();
        System.out.print("Gender: ");
        gender = sc.next().charAt(0);
        student = new Student(name,age,telephone,average,gender);
        System.out.println("Student registered");
        showRegister(student);
    }
    private static void showRegister(Student student) {
        System.out.println("Showing data");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Telephone: " + student.getTelephone());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Gender: " + student.getGender());
    }
}