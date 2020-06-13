package WorkWeekend1;

import WorkDay3.Company.Employee;

public class Person {

    private String name;
    private int age;
    private  static int total = 0;
    private static int count = 0;
    //private Person[] personArr = new Person[10];



    public Person(String name, int age) {
      this.name = name;
      this.age = age;
      total++;
      count++;
    }

    public Person(String name) {

      this.name = name;
      total++;
    }

    public Person() {
      total++;
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
    public void printele(){
      System.out.println("姓名:"+getName()+"年龄:"+getAge());
    }
    public void print(){

      System.out.println("总共创建"+total+"个对象");
      System.out.println("总共调用"+count+"次");
    }


}