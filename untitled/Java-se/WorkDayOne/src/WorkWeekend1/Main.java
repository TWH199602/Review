package WorkWeekend1;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    Person zhangsan = new Person("张三", 18);
    Person lisi = new Person("李四");
    Person wangwu = new Person("王五");
    Person zhaoliu = new Person("赵六", 20);
    zhangsan.printele();
    lisi.printele();
    wangwu.printele();
    zhaoliu.printele();
    person.print();
  }
}
