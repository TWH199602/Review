package Student;

public class Student {
    /**
     * 使用java类描述一个学生类和其子类(小学生类、 中学生类， 高中生类)。
     *
     * 学生都具备名字成员和对应的get和set方法，get和set方法不能够被子类重写。 学生具备一个传入String名字的构造方法。
     * 都具备学习的方法。调用学习的方法
     * 编写一个main方法测试编写的类，依次创建小学生、中学生、高中生对象，分别调用学习的方法。
     */
    private String name;

    public Student(String name){
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    public void Study(){
        System.out.println(name + "正在学习");
    }





}
