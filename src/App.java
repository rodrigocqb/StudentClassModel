public class App {
    public static void main(String[] args) {
        Student rodrigo = new Student();
        rodrigo.setAge(23);
        rodrigo.setEmail("rodrigo@gmail.com");
        rodrigo.setName("Rodrigo");

        Teacher teacher = new Teacher();
        teacher.setAge(rodrigo.getAge() * 2);
        teacher.setName("Jorge");

        Subject physics = new Subject();
        physics.setName("Physics");
        physics.setTeacher(teacher);

        rodrigo.setSubjects(physics);

        System.out.println(rodrigo.getSubjects().get(0).getTeacher().getAge());
    }
}
