package Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("学生");
        Primary primary = new Primary("小学生");
        Middle middle = new Middle("中学生");
        University university = new University("大学生");

        student.Study();
        primary.Study();
        middle.Study();
        university.Study();


    }
}
