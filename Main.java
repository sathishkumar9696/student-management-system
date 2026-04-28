import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            // ADD STUDENT
            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                students.add(new Student(id, name, marks));
                System.out.println("Student Added!");

            }

            // VIEW STUDENTS
            else if (choice == 2) {

                for (Student s : students) {
                    s.display();
                }

            }

            // DELETE STUDENT
            else if (choice == 3) {

                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == id) {
                        students.remove(i);
                        System.out.println("Student deleted!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }
            }

            // SEARCH STUDENT
            else if (choice == 4) {

                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Student s : students) {
                    if (s.id == id) {
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }
            }

            // EXIT
            else if (choice == 5) {
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
