public class Subject {
    private String name;
    private Teacher teacher;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    Teacher getTeacher() {
        return this.teacher;
    }
}
