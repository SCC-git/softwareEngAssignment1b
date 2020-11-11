import java.util.ArrayList;

import assignment1.CourseProgramme;
import assignment1.Module;
import assignment1.Student;
import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        Student artsStudent1 = new Student("John Smith", 18, new DateTime(2002, 1, 1, 0, 0),1896936);
        Student artsStudent2 = new Student("Mary Smith", 17, new DateTime(2003, 1, 1, 0, 0),1767632);
        Student artsStudent3 = new Student("Tom O'Connor", 38, new DateTime(1982, 1, 1, 0, 0),11090080);
        ArrayList<Student> artsStudents = new ArrayList<>();
        artsStudents.add(artsStudent1);
        artsStudents.add(artsStudent2);
        artsStudents.add(artsStudent3);


        Student engStudent1 = new Student("Mick Jenkins", 21, new DateTime(1999, 1, 1, 0, 0), 161655);
        Student engStudent2 = new Student("Isaiah Rashad", 25, new DateTime(1995, 1, 1, 0, 0),16515468);
        Student engStudent3 = new Student("Dominic Fike", 26, new DateTime(1994, 1, 1, 0, 0),9794514);
        ArrayList<Student> engStudents = new ArrayList<>();
        engStudents.add(engStudent1);
        engStudents.add(engStudent2);
        engStudents.add(engStudent3);

        Student nursingStudent1 = new Student("Doug Dimmadome", 58, new DateTime(1962, 1, 1, 0, 0),1514262);
        Student nursingStudent2 = new Student("Timmy Turner", 19, new DateTime(2001, 1, 1, 0, 0),1468453);
        Student nursingStudent3 = new Student("Jam Baxter", 38, new DateTime(1982, 1, 1, 0, 0),1213484);
        ArrayList<Student> nursingStudents = new ArrayList<>();
        nursingStudents.add(nursingStudent1);
        nursingStudents.add(nursingStudent2);
        nursingStudents.add(nursingStudent3);

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.addAll(artsStudents);
        allStudents.addAll(engStudents);
        allStudents.addAll(nursingStudents);

        Module englishModule = new Module("English", "EN101", allStudents);

        ArrayList<Module> artsModules = new ArrayList<>();
        artsModules.add(new Module("Geography", "GY101", artsStudents));
        artsModules.add(new Module("History", "HY101", artsStudents));
        artsModules.add(new Module("Gaeilge", "GE101", artsStudents));
        artsModules.add(englishModule);

        ArrayList<Module> engModules = new ArrayList<>();
        engModules.add(new Module("Mechanics", "ME123", engStudents));
        engModules.add(new Module("Maths", "MA362", engStudents));
        engModules.add(new Module("Graphics", "EG456", engStudents));
        engModules.add(englishModule);

        ArrayList<Module> nursingModules = new ArrayList<>();
        nursingModules.add(new Module("Midwifery", "NY107", nursingStudents));
        nursingModules.add(new Module("Pediatrics", "NY107", nursingStudents));
        nursingModules.add(new Module("Bedside Manner", "NY233", nursingStudents));
        nursingModules.add(englishModule);

        ArrayList<CourseProgramme> testCourses = new ArrayList<>();
        testCourses.add(new CourseProgramme("Arts", artsModules, artsStudents, new DateTime(2019, 1, 1, 0, 0), new DateTime(2023, 1, 1, 0, 0)));
        testCourses.add(new CourseProgramme("Engineering", engModules, engStudents, new DateTime(2018, 1, 1, 0, 0), new DateTime(2022, 1, 1, 0, 0)));
        testCourses.add(new CourseProgramme("Nursing", nursingModules, nursingStudents, new DateTime(2017, 1, 1, 0, 0), new DateTime(2021, 1, 1, 0, 0)));

        for(CourseProgramme course : testCourses) {
            System.out.printf("Course: %s\nModules:\n", course);
            for(Module module : course.getModules()) {
                System.out.printf("\tModule: %-20s\t\tStudents in module: %s\n", module, module.getStudents());
            }
            System.out.println("\n");
        }

        for(Student student : allStudents) {
            System.out.printf("Student: %-30s Username: %-20s Modules: %-90s Course(s): %-30s\n", student, student.getUsername(), student.getModules(), student.getCourses());
        }
    }
}
