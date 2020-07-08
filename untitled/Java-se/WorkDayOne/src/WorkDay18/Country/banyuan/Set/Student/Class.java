package WorkDay18.Country.banyuan.Set.Student;

import java.util.*;

public class Class implements Comparator{
    Set<Student> students = new LinkedHashSet<>();
    public void addStudent(Set<Student> students){
        students.addAll(students);

    }
    public void printAll() {
        for (Student studentAll : students) {
            System.out.println(studentAll);
        }
//        for (Student studentAll : students) {
//            System.out.println(studentAll);
//        }
    }
    public List<Student> idUp() {
        Set<Student> students = new TreeSet<>(Comparator.comparingInt(Student::getId));
        students.addAll(students);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(students);
        return studentList;
    }

    public List<Student> ageDown() {
        Set<Student> students = new TreeSet<>((o1, o2) -> {
            return o2.getAge() - o1.getAge();
        });
        students.addAll(students);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(students);
        return studentList;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Class() {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "students=" + students +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Comparator reversed() {
        return null;
    }
}
