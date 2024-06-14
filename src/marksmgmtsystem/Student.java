package marksmgmtsystem;

/**
 * Represents a student in the Marks Management application. This class holds
 * basic student information and their marks in specific courses.
 */
class Student {
    protected String studentId;
    protected String studentName;
    private double programmingFundamentalsMarks;
    private double databaseManagementSystemMarks;

    /**
     * Constructor for the Student class. Initializes a new student with default
     * marks set to 0.0.
     * 
     * @param studentId   Unique identifier for the student.
     * @param studentName Name of the student.
     */
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.programmingFundamentalsMarks = 0.0;
        this.databaseManagementSystemMarks = 0.0;
    }

    // Getter and setter methods for private and protected variables START

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getProgrammingFundamentalsMarks() {
        return programmingFundamentalsMarks;
    }

    public void setProgrammingFundamentalsMarks(double programmingFundamentalsMarks) {
        this.programmingFundamentalsMarks = programmingFundamentalsMarks;
    }

    public double getDatabaseManagementSystemMarks() {
        return databaseManagementSystemMarks;
    }

    public void setDatabaseManagementSystemMarks(double databaseManagementSystemMarks) {
        this.databaseManagementSystemMarks = databaseManagementSystemMarks;
    }

    // Getter and setter methods for private and protected variables END

    /**
     * Provides a string representation of the student's information. Includes
     * student ID, name, and marks in Programming Fundamentals and DBMS.
     * 
     * @return Formatted string with student details.
     */
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", Programming Fundamentals Marks: " + programmingFundamentalsMarks
                + ", Database Management System Marks: " + databaseManagementSystemMarks;
    }
}
