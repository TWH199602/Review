package WorkDay3.Company;

public class Main {
  public static void main(String[] args) {
    Company company = new Company();
    Employee employee1 = new Employee();
    employee1.setName("张三");
    employee1.setWorkHour(205);
    employee1.setBaseSalary(2000);
    Employee employee2 = new Employee();
    employee2.setName("李四");
    employee2.setWorkHour(220);
    employee2.setBaseSalary(2000);
    Employee employee3 = new Employee();
    employee3.setName("王五");
    employee3.setWorkHour(180);
    employee3.setBaseSalary(2000);
    Employee employee4 = new Employee();
    employee4.setName("赵六");
    employee4.setWorkHour(196);
    employee4.setBaseSalary(2000);
    company.add(employee1);
    company.add(employee2);
    company.add(employee3);
    company.add(employee4);

    company.printAll();

    System.out.println(employee1.getName()+"的总工资"+employee1.getSalary());
    System.out.println(employee2.getName()+"的总工资"+employee2.getSalary());
    System.out.println(employee3.getName()+"的总工资"+employee3.getSalary());
    System.out.println(employee4.getName()+"的总工资"+employee4.getSalary());
    System.out.println("公司支付的总工资为："+company.sumSalary());

//    company.remove("赵六");
//    company.printAll();
//
//    company.remove("李四");
//    company.printAll();
//
//    company.remove("王五");
//    company.printAll();
//
//    company.remove("张三");
//    company.printAll();

  }
}
