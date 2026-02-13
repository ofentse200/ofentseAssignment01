import domain.PartTimeStudent;
import domain.UndergraduateStudent;
import domain.GraduateStudent;
public class Main {

    public static void main(String[] args) {

        PartTimeStudent u1 = new UndergraduateStudent.UndergraduateStudentBuilder("221008785", "ofentse lebaka", "221008785@mycput.ac.za", "ICT:Application Development")
                .creditHours(15)
                .scholarshipAmount(5000)
                .build();
        PartTimeStudent g1 = new GraduateStudent.GraduateStudentBuilder("221108785", "Daniel masemola", "221108785@mycput.ac.za", "Computer Engineering")
                .researchAssistant(true)
                .stipend(12000)
                .build();
        u1.displayStudentDetails();
        g1.displayStudentDetails();
    }
}
