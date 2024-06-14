package marksmgmtsystem;

/**
 * Represents a graduate student, extending the general Student class.
 * This class adds specific properties and methods relevant to graduate students.
 */
class GraduateStudent extends Student {
    private String researchArea;

    /**
     * Constructor for GraduateStudent.
     * @param studentId Unique identifier for the student.
     * @param studentName Name of the student.
     * @param researchArea Area of study or research focus for the graduate student.
     */
    public GraduateStudent(String studentId, String studentName, String researchArea) {
        super(studentId, studentName);
        this.researchArea = researchArea;
    }

    
    /**
     * Overridden toString method to include research focus in the student's information.
     * @return String representation of the graduate student.
     */
    @Override
    public String toString() {
        return super.toString() + ", Research Area: " + researchArea;
    }
    
    
    /**
     * Getter for the research area.
     * @return research area of the graduate student.
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * Setter for the research area.
     * @param researchArea Area of study or research focus to be set.
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
