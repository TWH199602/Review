package club.banyuan.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

  /**
   * 1.八个数据类型 以及大小
   * 2.顺序  选择  循环  for  while   do {} while();
   * 3.数组 静态 动态
   *        要求1：对数组里面的数据进行增删改查     Student[] stu=new Student[5];
   *              查询的方法 要有以下几个：a.查询单个对象  b.查询满足条件的所有对象 +
   *      方法：有参数和无参数      有返回值和无返回值
   *      方法重载：
   *
   *
   *
   *
   * 4.面向对象
   *   a.什么是类，什么是对象？
   *   b.为什么要进行封装？
   *          共性（属性和方法全部抽取放到一个类里面）
   *          class   A{
   *
   *          }
   *          this
   *
   *
   *
   *          public
   *          protected
   *          默认的
   *          private
   *      要求2：以上访问修饰符 用代码展示出其作用
   *
   *
   * 5.static  被所有的class 对象共享   优先于对象存在
   *
   *
   * 6.继承
   *      除了父类的私有化成员不能被继承，其他的成员一律可以继承
   *      当父类跟子类的变量名重复的时候，优先使用子类自己的
   *
   *
   *
   * 7.多态
   *      不同时刻的不同形态
   *
   *    前提：a.要有继承    b.发生方法重写  c.父类引用指向子类对象
   *
   * 8.抽象类
   *      要求3：自己编写代码区别抽象类和普通类的区别和接口的区别
   *              从成员变量和成员方法进行对比
   *
   *
   * 9.接口
   *      降低耦合性
   *
   * @param args
   *
   *
   *
   */


  public static void main(String[] args) {

    Collection  c=new ArrayList();



    A   a=new A();

    Student  student=new Student();

    // System.out.printf(student.name);
    student.setName("sadas");

    Worker worker = new Worker();
    worker.setName("sdas");

    //System.out.println(worker.toString());

    System.out.println(worker.tree);

    /**
     *  对于变量而言  编译时看左边  运行时看左边
     *  对于方法而言  编译时看左边  运行时看右边
     *  对于静态方法而言  不存在重写
     *
     */
    Animal  animal=new Cat();
    animal.run();
    System.out.println(animal.address);

    Animal  animal1=new Dog();
    animal1.run();

    //父类想要用子类特有的方法 怎么做
    Animal  animal2=new  Cat();
    //animal2.findWife();
    Cat   cat=(Cat)animal2;  //强制类型转换  用子类特有的方法
    cat.findWife();


  }

//    public   static   Object[] getObj(tiaojian ){
//        return  shuzu ;
//    }


}




class  Animal{
  private   String name;
  private   int age;

  public String  address="shanghai";


  public Animal() {
  }

  public  void  run(){
    System.out.println("Animal  eating");
  }



  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public   void  sleep(String  name){

  }






}


class  Cat  extends  Animal{
  public String  address="hongkong";


  public  void  run(){
    System.out.println("clamb Tree");
  }

  public   void  sleep(String name){

  }
  public   void  sleep(Integer  name){

  }




  public void findWife(){

    System.out.println("findWife...");
  }







}

class  Dog extends  Animal{

  public  void  run(){
    System.out.println("run....");
  }


}










class    Worker extends  Student{

  public  String   tree="son";

  public  Worker(){
    super();
  }






}


class    Student{


  public  String   tree="father";
  String  banyuan="banyuan";


  private    void  method(){
    System.out.println("private method");
  }
  protected     void  method1(){
    System.out.println("protected method");
  }
  public  static    void  method2(){
    System.out.println("public method");
  }
  void  method3(){
    System.out.println("default method");
  }




  private  String name;
  private  String  IdCard;
  private  int age;

  //省略set/get


  public Student() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdCard() {
    return IdCard;
  }

  public void setIdCard(String idCard) {
    IdCard = idCard;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", IdCard='" + IdCard + '\'' +
        ", age=" + age +
        '}';
  }
}





class  A{

  private  String name="";

  public  static String  address="dizhi"; //属于类A 编译之后的class文件  A.class


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public  void   get(){
    System.out.printf("this---"+this.name);
  }


}


