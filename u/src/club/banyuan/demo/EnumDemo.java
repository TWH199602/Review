package club.banyuan.demo;

public enum EnumDemo {


    MYSQL("开源的关系型数据库..."),
    ORACLE("收费的关系型数据库..."),
    SQLSERVER("开源的关系型数据库..."),
    MONGODB("开源的非关系型数据库..."),
    REDIS ("开源的非关系型数据库...");



    private  String message;

    private EnumDemo(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }


}

class TestEnum{

    public static void main(String[] args) {
        EnumDemo oracle = EnumDemo.ORACLE;
        System.out.println(oracle.getMessage());

    }

}