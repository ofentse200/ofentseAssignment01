package factory;

import domain.PartTimeStudent;
import domain.UndergraduateStudent;
import domain.GraduateStudent;

public class studentfactory {
    public static PartTimeStudent createUndergraduateStudent(String studentId, String name, String email,
                                                             String department, int creditHours,
                                                             double scholarshipAmount) {
        return new UndergraduateStudent.UndergraduateStudentBuilder(studentId, name, email, department)
                .creditHours(creditHours)
                .scholarshipAmount(scholarshipAmount)
                .build();
    }

    public static PartTimeStudent createGraduateStudent(String studentId, String name, String email,
                                                        String department, boolean researchAssistant,
                                                        double stipend) {
        return new GraduateStudent.GraduateStudentBuilder(studentId, name, email, department)
                .researchAssistant(researchAssistant)
                .stipend(stipend)
                .build();
    }

    public static PartTimeStudent createUndergraduateStudent (String studentId, String name,
                                                             String email, String department) {
        return new UndergraduateStudent.UndergraduateStudentBuilder(studentId, name, email, department)
                .build();
    }
    public static PartTimeStudent createGraduateStudent(String studentId, String name,
                                                        String email, String department) {
        return new GraduateStudent.GraduateStudentBuilder(studentId, name, email, department)
                .build();
    }
}
