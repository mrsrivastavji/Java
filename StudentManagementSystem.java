import java.util.ArrayList;
import java.util.Scanner;

// Student Class (Model)
class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }

    // For formatted printing
    public void showInfo() {
        System.out.printf("%-10d %-20s %-10d %-20s\n", id, name, age, course);
    }
}



// Manager Class – handles operations
class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = getValidatedInt();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = getValidatedInt();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n-----------------------------------------------");
        System.out.printf("%-10s %-20s %-10s %-20s\n", "ID", "NAME", "AGE", "COURSE");
        System.out.println("-----------------------------------------------");

        for (Student s : students) {
            s.showInfo();
        }
        System.out.println("-----------------------------------------------");
    }

    // Update Student
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = getValidatedInt();

        Student s = searchById(id);
        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter new name (leave blank to skip): ");
        String name = sc.nextLine();
        if (!name.isEmpty()) s.setName(name);

        System.out.print("Enter new age (0 to skip): ");
        int age = getValidatedInt();
        if (age > 0) s.setAge(age);

        System.out.print("Enter new course (leave blank to skip): ");
        String course = sc.nextLine();
        if (!course.isEmpty()) s.setCourse(course);

        System.out.println("Student updated successfully!");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = getValidatedInt();

        Student s = searchById(id);
        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        students.remove(s);
        System.out.println("Student deleted successfully!");
    }

    // Helper method to search
    private Student searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    // Input Validation for integers
    private int getValidatedInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Enter a number: ");
            }
        }
    }

    // Show Menu
    public void showMenu() {
        int choice;

        while (true) {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = getValidatedInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}



// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        manager.showMenu();

    }
}
