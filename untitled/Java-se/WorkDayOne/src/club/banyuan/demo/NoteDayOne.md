## Note1 2020-6-8
### 1.Code
    package club.banyuan.demo;


    public class Demo {

    public static void main(String[] args) {
    System.out.println(0xFFFFFFFF);
    System.out.println(0x1FFFFFFFFL);
    //增强for循环代码示例
    int [] a = null;
    for (int temp : a )
    System out println(temp); 
    }
    }
    
### 2.课上内容    
    1、null只能给引用数据类型赋值
    2、null不能给基本数据类型赋值
    3、int a = null;不能赋值
    4、驼峰命名法；小驼峰：方法名使用小驼峰命名法，首字母小写，之后每个单词首字母大写
                 大驼峰：类名使用大驼峰命名法，首字母大写，之后每个单词首字母大写
    5、malloc对分配的区域不会初始化
    6、calloc对分配的区域进行初始化，全部置0
    7、8种基本数据类型：int 、short 、long 、float 、boolen 、byte 、double 、char

### 3.new关键字的应用
####3.1、new 关键字用于创建类的新实例。
    
    示例：
          String sName = new String();
          Float fVal = new Float(0.15);
    
注释：
 #####1.new 关键字后面的参数必须是类名，并且类名的后面必须是一组构造方法参数(必须带括号)。
 #####2.参数集合必须与类的构造方法的签名匹配。
 #####3.= 左侧的变量的类型必须与要实例化的类或接口具有赋值兼容关系。