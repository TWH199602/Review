## 回顾
#####jdk>jre>jvm
#####什么是环境变量，如何显示环境变量？
#####指示命令行命令搜索的命令；echo $PATH
#####a = a++(+a);等于a+a+1
### 1.类型转换
#### 1.1.强制类型转换
    class Demo{
        public static void main(String[] args){
        short shortOne = 1;
        short shortTwo = 2;
        shortTwo += shortOne;
        short three = (short)
    
    
### 2.字符串的拼接
#####基本数据类型和字符串使用+号连接，会转变成数值对应的字符串
#####字符串+基本数据类型

    // 使用 + 号，拼接字符串
    System.out.println("字符串：" + 15); // 字符串：15
    System.out.println("字符串：" + 'a'); // 字符串：a
    System.out.println("字符串：" + true); // 字符串：true
    System.out.println("字符串：" + 3.14); // 字符串：3.14
注意拼接字符串时的运算执行的先后顺序对拼接结果的影响

    System.out.println(3 + 4 + "字符串"); // 7字符串
    System.out.println("字符串" + 3 + 4); // 字符串34

### 3.程序组织
#### 3.1程序流程控制
##### 
    package WorkDay2;
      
      public class Test {
      
        public static void main(String[] args) {
          int test = 2;
          switch (test) {
            case 1:
              System.out.println(1);
              break;
            case 2:
              System.out.println(2);
            case 3:
              System.out.println(3);
              break;
            default://在所有case都不满足时执行default.
              System.out.println("default");
      
              boolean test = 1>2;
              if (test) { //判断条件必须是boolean类型；
                System.out.println("1");
              }
              else{
                System.out.println("2");
              }
          }
        }
      
          int b = 5;
          if (b < 0) {
            System.out.println("1");
          } else if (b > 4) { //或者写为else {System.out.println("2");}  :else后面要么不加判断条件，加了判断条件需要写为else if
            System.out.println("2");
          }
        }
      }
          int test = 5;//变量的初始化必须在代码块外部进行，否则在for循环中会一直循环定义
          for (; ; ) { //for（int test = 5;test++ <10 ;test++ )是被允许的；
            //int test = 5;
            System.out.println(test);
            if (test++ > 10) {
              break;
            }
          }
        }
      }
      
#### 3.2方法重载
##### 构成方法的重载看方法的入参的数据类型不同，或者数据类型以及参数个数不同；仅参数名不同，数据类型相同，不构成方法重载；
方法重载是指在一个类中定义多个同名的方法，但要求每个方法具有不同的参数的类型或参数的个数。调用重载方法时，Java能通过检查调用的方法的参数选择一个恰当的方法。


要实现方法重载，必须要保证名称相同的函数的参数列表不一样，参数个数或参数数据类型不同，参数名称不同不算是重载。要看每个参数的参数类型是不是一样。

重载方法调用的时候必须能够让编译器判断出到底调用哪个方法，不然无法通过编译。

    public static void main(String[] args) {
        print(new String[]{"1", "2"});
        print("1");
        // print(null); // 编译报错，无法通过传入的值推断应该调用哪个函数
      }
    
      static void print(String s) {
        System.out.println("打印字符串");
        System.out.println(s);
      }
    
      static void print(String[] arr) {
        System.out.println("打印数组");
        for (String s : arr) {
          System.out.println(s);
        }
      }