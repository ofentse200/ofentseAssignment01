package domain;

public class UndergraduateStudent extends PartTimeStudent {

    private int creditHours;
    private double scholarshipAmount;
    private UndergraduateStudent(UndergraduateStudentBuilder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double baseAmount = creditHours * 500; // $500 per credit hour
        return baseAmount - scholarshipAmount;
    }
    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }
    @Override
    public void displayStudentDetails() {

        System.out.println("========================================");

        System.out.println("Student Type: " + getStudentType());
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship Amount: R" + scholarshipAmount);
        System.out.println("Tuition Amount: R" + calculateTuition());

        System.out.println("========================================");
    }

    // Getters
    public int getCreditHours() {
        return creditHours;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", creditHours=" + creditHours +
                ", scholarshipAmount=" + scholarshipAmount +
                '}';
    }

    public static class UndergraduateStudentBuilder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours = 0;
        private double scholarshipAmount = 0;

        public UndergraduateStudentBuilder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public UndergraduateStudentBuilder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public UndergraduateStudentBuilder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
