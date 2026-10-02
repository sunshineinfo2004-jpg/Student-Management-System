
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    students.add(new Student(id, name, email, course));

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    boolean found = false;

                    for (Student student : students) {
                        if (student.getId() == searchId) {
                            System.out.println("\nStudent found:");
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    boolean deleted = students.removeIf(
                            student -> student.getId() == deleteId
                    );

                    if (deleted) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Student Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    students.add(new Student(id, name, email, course));

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    boolean found = false;

                    for (Student student : students) {
                        if (student.getId() == searchId) {
                            System.out.println("\nStudent found:");
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    boolean deleted = students.removeIf(
                            student -> student.getId() == deleteId
                    );

                    if (deleted) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    boolean updated = false;

                    for (Student student : students) {

                        if (student.getId() == updateId) {

                            System.out.print("Enter New Name: ");
                            String newName = scanner.nextLine();

                            System.out.print("Enter New Email: ");
                            String newEmail = scanner.nextLine();

                            System.out.print("Enter New Course: ");
                            String newCourse = scanner.nextLine();

                            student.setName(newName);
                            student.setEmail(newEmail);
                            student.setCourse(newCourse);

                            System.out.println("Student updated successfully!");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 6:
                    System.out.println(
                            "Thank you for using Student Management System!"
                    );
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
