package domain;

public class GraduateStudent extends PartTimeStudent {

    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(GraduateStudentBuilder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 8000;
        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override

    public void displayStudentDetails()

    {

        System.out.println("========================================");
        System.out.println("Student Type: " + getStudentType());
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: R" + stipend);
        System.out.println("Tuition Amount: R" + calculateTuition());
        System.out.println("========================================");

    }

    // Getters

    public boolean isResearchAssistant() {
        return researchAssistant;
    }

    public double getStipend() {
        return stipend;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", researchAssistant=" + researchAssistant +
                ", stipend=" + stipend +
                '}';
    }

    // Builder

    public static class GraduateStudentBuilder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant = false;
        private double stipend = 0;

        public GraduateStudentBuilder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public GraduateStudentBuilder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public GraduateStudentBuilder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
