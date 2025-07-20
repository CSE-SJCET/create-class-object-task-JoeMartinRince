public class Student {
    String name;
    int rollNumber;
    char grade;

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        // TODO: Create Student object
        Student student = new Student();

        // TODO: Assign sample data
        student.name = "Alice Johnson";
        student.rollNumber = 101;
        student.grade = 'A';

        // TODO: Call displayDetails()
        student.displayDetails();
    }
}
