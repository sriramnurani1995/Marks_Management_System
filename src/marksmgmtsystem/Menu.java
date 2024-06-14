
package marksmgmtsystem;

import java.util.List;
import java.util.Scanner;

/**
 * Menu class for the Marks Management System application. This class provides the user
 * interface for managing student records, offering functionalities like adding,
 * updating, and deleting students.
 */
class Menu {
    private StudentManager studentManager;
    private Scanner scanner;

    /**
     * Constructor for Menu class. Initializes the StudentManager and Scanner instances.
     */
    public Menu() {
        studentManager = new StudentManager();
        scanner = new Scanner(System.in);
    }


    /**
     * Adds an undergraduate student by collecting details from the user.
     */
    private void addUndergraduateStudent() {
        // Implementation for adding an undergraduate student
        try {
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter major: ");
            String major = scanner.nextLine();

            UndergraduateStudent newStudent = new UndergraduateStudent(studentId, studentName, major);
            studentManager.addStudent(newStudent);
            System.out.println("Undergraduate student added successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while adding an undergraduate student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Adds a graduate student by collecting details from the user.
     */
    private void addGraduateStudent() {
        // Implementation for adding a graduate student
        try {
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter Area of Study Or Research Focus: ");
            String researchArea = scanner.nextLine();

            GraduateStudent newStudent = new GraduateStudent(studentId, studentName, researchArea);
            studentManager.addStudent(newStudent);
            System.out.println("Graduate student added successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while adding a graduate student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Updates the name of a student identified by their student ID.
     */
    private void updateStudentName() {
        // Implementation for updating a student's name
        try {
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter New Student Name: ");
            String newStudentName = scanner.nextLine();

            studentManager.updateStudentName(studentId, newStudentName);
        } catch (Exception e) {
            System.out.println("An error occurred while updating the student name. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Updates the marks of a student identified by their student ID.
     */
    private void updateStudentMarks() {
        // Implementation for updating a student's marks
        try {
        	System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter Programming Fundamentals Marks: ");
			double progFundamentalsMarks = scanner.nextDouble();
			System.out.print("Enter Database Management System Marks: ");
			double dbmsMarks = scanner.nextDouble();
			studentManager.updateStudentMarks(studentId, progFundamentalsMarks, dbmsMarks);
        } catch (Exception e) {
            System.out.println("An error occurred while updating the student marks. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

  

    /**
     * Displays the list of all students.
     */
    private void displayStudents() {
        // Implementation for displaying all students
        try {
            List<Student> students = studentManager.getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the students. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Displays the student Topper in the Database Management System class.
     */
    private void displayTopperInDatabaseManagementSystem() {
        // Implementation for displaying the student Topper in Database Management System
        try {
            Student StudentTopper = studentManager.getTopperInDatabaseManagementSystem();
            if (StudentTopper != null) {
                System.out.println("Top Student in Database Management System: " + StudentTopper);
            } else {
                System.out.println("No student data available.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the best student in Database Management System. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Displays the student Topper in the Programming Fundamentals class.
     */
    private void displayTopperInProgrammingFundamentals() {
        // Implementation for displaying the student Topper in Programming Fundamentals
        try {
            Student StudentTopper = studentManager.getTopperInProgrammingFundamentals();
            if (StudentTopper != null) {
                System.out.println("Best Student in Programming Fundamentals: " + StudentTopper);
            } else {
                System.out.println("No student data available.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the best student in Programming Fundamentals. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Deletes a student identified by their student ID.
     */
    private void deleteStudent() {
        // Implementation for deleting a student
        try {
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();

            studentManager.deleteStudent(studentId);
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Displays the main menu with various options and handles user input.
     * The menu offers functionalities like adding, updating, and displaying student records.
     */
    public void displayMenu() {
        // Menu implementation with try-catch for exception handling
        try {
            while (true) {
                System.out.println("1. Add Undergraduate Student");
                System.out.println("2. Add Graduate Student");
                System.out.println("3. Update Student Name");
                System.out.println("4. Update Student Marks");
                System.out.println("5. Delete Student");
                System.out.println("6. Display Students");
                System.out.println("7. Display Best Student in Programming Fundamentals");
                System.out.println("8. Display Best Student in Database Management System");
                System.out.println("9. Exit the Application");

                System.out.print("Enter your choice: ");

                int selectedChoice = scanner.nextInt();
                scanner.nextLine();

                switch (selectedChoice) {
                    case 1:
                        addUndergraduateStudent();
                        break;
                    case 2:
                        addGraduateStudent();
                        break;
                    case 3:
                        updateStudentName();
                        break;
                    case 4:
                        updateStudentMarks();
                        break;
                    case 5:
                        deleteStudent();
                        break;
                    case 6:
                        displayStudents();
                        break;
                    
                    case 7:
                        displayTopperInProgrammingFundamentals();
                        break;
                    case 8:
                        displayTopperInDatabaseManagementSystem();
                        break;
                    case 9:
                        System.out.println("Exiting the application... and returning. Application will Terminate Shortly");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the menu. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
