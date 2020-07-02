package WorkDay18.Country.banyuan.Set.Student;

import java.util.*;

/**
 * 创建一个学生类，具有属性 id，name，age
 *
 * 创建一个班级类，在班级类中
 * 1. 创建一个Set集合用于存放学生对象，Set集合中不能存在相同id的对象
 * 2. 编写一个方法录入多条数据
 * 3. 编写一个方法遍历集合，输出学生信息
 * 4. 编写一个方法返回一个List根据id升序排序
 * 5. 编写一个方法返回一个List根据age降序排序
 * 6. 创建测试类进行测试
 */

public class Main {

    public static void main(String[] args) {
        Class studentClass = new Class();
        Set<Student> studentSet = new LinkedHashSet<>();
        studentSet.add(new Student("张三",1,16));
        studentSet.add(new Student("李四",2,17));
        studentSet.add(new Student("王五",3,18));
        studentSet.add(new Student("赵六",5,20));
        studentClass.addStudent(studentSet);
        studentClass.printAll();
        System.out.println(studentClass.idUp());
        System.out.println(studentClass.ageDown());





    }


}
