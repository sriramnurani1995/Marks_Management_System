package marksmgmtsystem;

/**
 * Represents an undergraduate student, extending the Student class. This class
 * includes specific properties relevant to undergraduate students, such as
 * field of study.
 */
class UndergraduateStudent extends Student {
    private String major;

    /**
     * Constructor for UndergraduateStudent.
     * 
     * @param studentId Unique identifier for the student.
     * @param studentName Name of the student.
     * @param major Major or field of study for the undergraduate student.
     */
    public UndergraduateStudent(String studentId, String studentName, String major) {
        super(studentId, studentName);
        this.major = major;
    }

  

    /**
     * Overridden toString method to include major in the student's
     * information.
     * 
     * @return String representation of the undergraduate student.
     */
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
    
    
    
    /**
     * Getter for the major or field of study.
     * 
     * @return The major of the undergraduate student.
     */
    public String getMajor() {
        return major;
    }

    /**
     * Setter for the major or field of study.
     * 
     * @param major The major to be set for the undergraduate student.
     */
    public void setMajor(String major) {
        this.major = major;
    }
}
