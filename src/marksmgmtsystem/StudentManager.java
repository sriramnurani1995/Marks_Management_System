package marksmgmtsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the student records for the Marks Management application. This class
 * handles operations such as adding, updating, and deleting student records.
 */
class StudentManager {
    private List<Student> students;

    /**
     * Constructor for StudentManager. Initializes a list to hold student records.
     */
    public StudentManager() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the student list. Checks for duplicate entries based on
     * student ID before adding.
     * 
     * @param student The student object to be added.
     */
    public void addStudent(Student student) {
        try {
            for (Student studentObject : students) {
                if (studentObject.getStudentId().equals(student.getStudentId())) {
                    System.out.println("Student already exists.");
                    return;
                }
            }
            students.add(student);
        } catch (Exception e) {
            System.out.println("An error occurred while adding a student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Updates the name of a student identified by their student ID.
     * 
     * @param studentId      The ID of the student to update.
     * @param newStudentName The new name to be set.
     */
    public void updateStudentName(String studentId, String newStudentName) {
        try {
            Student student = findStudent(studentId);
            if (student != null) {
                student.setStudentName(newStudentName);
                System.out.println("Student name updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while updating the student name. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Updates the marks of a student identified by their student ID for both subjects.
     * 
     * @param studentId The ID of the student to update.
     * @param newProgrammingMarks  The new marks for Programming Fundamentals.
     * @param newDatabaseMarks  The new marks for Database Management System.
     */
    public void updateStudentMarks(String studentId, double newProgrammingMarks, double newDatabaseMarks) {
        try {
            Student student = findStudent(studentId);
            if (student != null) {
                student.setProgrammingFundamentalsMarks(newProgrammingMarks);
                student.setDatabaseManagementSystemMarks(newDatabaseMarks);
                System.out.println("Student marks updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while updating the student marks. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    

    /**
     * Gets the list of all students.
     * 
     * @return List of students.
     */
    public List<Student> getAllStudents() {
        return students;
    }

    /**
     * Finds the top student in Programming Fundamentals.
     * 
     * @return The student with the highest marks in Programming Fundamentals.
     */
    public Student getTopperInProgrammingFundamentals() {
        Student studentTopper = null;
        double highestMarks = 0.0;
        try {
            for (Student student : students) {
                if (student.getProgrammingFundamentalsMarks() > highestMarks) {
                    highestMarks = student.getProgrammingFundamentalsMarks();
                    studentTopper = student;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while finding the best student in Programming Fundamentals. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return studentTopper;
    }

    /**
     * Finds the top student in Database Management Systems.
     * 
     * @return The student with the highest marks in Database Management Systems.
     */
    public Student getTopperInDatabaseManagementSystem() {
        Student studentTopper = null;
        double highestMarks = 0.0;
        try {
            for (Student student : students) {
                if (student.getDatabaseManagementSystemMarks() > highestMarks) {
                    highestMarks = student.getDatabaseManagementSystemMarks();
                    studentTopper = student;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while finding the best student in Database Management System. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return studentTopper;
    }
    
    
    
    /**
     * Finds a student in the list by their student ID.
     * 
     * @param studentId The ID of the student to find.
     * @return The found Student object or null if not found.
     */
    public Student findStudent(String studentId) {
        try {
            for (Student student : students) {
                if (student.getStudentId().equals(studentId)) {
                    return student;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("An error occurred while finding the student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    /**
     * Deletes a student from the list based on their student ID.
     * 
     * @param studentId The ID of the student to delete.
     */
    public void deleteStudent(String studentId) {
        try {
            Student student = findStudent(studentId);
            if (student != null) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the student. Details:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
