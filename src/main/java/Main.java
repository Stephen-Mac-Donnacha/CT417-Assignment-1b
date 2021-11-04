import org.joda.time.DateTime;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args){
    Course c1 = new Course("Nuclear Physics",
            new ArrayList<Module>(),
            new ArrayList<Student>(),
            DateTime.parse("2020-01-01"),
            DateTime.parse("2020-01-01")
    );

    Course c2 = new Course("Computer Science",
            new ArrayList<Module>(),
            new ArrayList<Student>(),
            DateTime.parse("2020-01-01"),
            DateTime.parse("2020-09-01")
    );

    Course c3 = new Course("Jam Making",
            new ArrayList<Module>(),
            new ArrayList<Student>(),
            DateTime.parse("2020-01-01"),
            DateTime.parse("2020-01-01")
    );

    Student s1 = new Student("Homer Simpson",
            21,
            183194091,
            c1,
            new ArrayList<Module>()
    );

    Student s2 = new Student("Van Burg",
            22,
            2131244,
            c2,
            new ArrayList<Module>()
    );

    Student s3 = new Student("Ralph Wiggum",
            22,
            198764312,
            c3,
            new ArrayList<Module>()
    );

    Module m1 = new Module("Introduction to Physics",
            "PH101",
            new ArrayList<Student>(),
            new ArrayList<Course>()
    );

    Module m2 = new Module("Software Engineering III",
            "CT417",
            new ArrayList<Student>(),
            new ArrayList<Course>()
    );

    Module m3 = new Module("Berries",
            "BP102",
            new ArrayList<Student>(),
            new ArrayList<Course>()
    );

    ArrayList<Student> students1 = new ArrayList<>();
    ArrayList<Student> students2 = new ArrayList<>();
    ArrayList<Student> students3 = new ArrayList<>();
    students1.add(s1);
    students2.add(s2);
    students3.add(s3);


    c1.setStudents(students1);
    c2.setStudents(students2);
    c3.setStudents(students3);


    ArrayList<Module> modules1 = new ArrayList<Module>();
    ArrayList<Module> modules2 = new ArrayList<Module>();
    ArrayList<Module> modules3 = new ArrayList<Module>();

    modules1.add(m1);
    modules1.add(m3);
    modules2.add(m2);
    modules3.add(m2);
    modules3.add(m3);

    s1.setModules(modules1);
    s2.setModules(modules2);
    s3.setModules(modules3);

    System.out.println("=======================================");
    System.out.println(s1);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(s2);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(s3);
    System.out.println("========================================");


    System.out.println("=======================================");
    System.out.println(m1);
    System.out.println("========================================");

    System.out.println("========================================");
    System.out.println(m2);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(m3);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(c1);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(c2);
    System.out.println("========================================");

    System.out.println("=======================================");
    System.out.println(c3);
    System.out.println("========================================");
    }
}
