package domain;

public abstract class PartTimeStudent {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    protected PartTimeStudent(String studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }
    public abstract double calculateTuition();
    public abstract String getStudentType();
    public abstract void displayStudentDetails();

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

public static class PartTimeStudentBuilder {
    private String studentId;
    private String name;
    private String email;
    private String department;
    private boolean researchAssistant = false;
    private double stipend = 0;

    public PartTimeStudentBuilder(String studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }
    public PartTimeStudentBuilder(PartTimeStudentBuilder partTimeStudentBuilder) {

    }
    public PartTimeStudent.PartTimeStudentBuilder researchAssistant(boolean researchAssistant) {
        this.researchAssistant = researchAssistant;
        return this;
    }
    public PartTimeStudent.PartTimeStudentBuilder stipend(double stipend) {
        this.stipend = stipend;
        return this;
    }
    public GraduateStudent build() {
        return new PartTimeStudentBuilder( this).build();
    }
    }
}




