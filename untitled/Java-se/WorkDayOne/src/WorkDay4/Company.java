package WorkDay4;

public class Company {
  String employeeName;

  void method(int num){
    employeeName += num ;//字符串拼接；

  }

  public static void main(String[] args) {
    Company company = new Company();
    company.employeeName = "1";
    company.method(4);
    Company company2 = new Company();
    company2.employeeName = "2";
    company2.method(5);
    System.out.println(company.employeeName);
    System.out.println(company2.employeeName);
  }

}
