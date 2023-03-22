import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String email;
    private List<Subject> subjects = new ArrayList<>();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }

    void setSubjects(Subject subject) {
        this.subjects.add(subject);
    }

    List<Subject> getSubjects() {
        return this.subjects;
    }
}
