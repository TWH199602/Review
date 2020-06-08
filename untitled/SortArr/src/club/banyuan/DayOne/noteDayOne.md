## Note1 2020-6-8
    package club.banyuan.demo;


    public class Demo {

    public static void main(String[] args) {
    System.out.println(0xFFFFFFFF);
    System.out.println(0x1FFFFFFFFL);
    int [] a = null;
    for (int temp : a )
    System out println(temp); 
    }
    }
    
#### null只能给引用数据类型赋值
####null不能给基本数据类型赋值
####int a = null;不能赋值
####驼峰命名法；小驼峰：方法名使用小驼峰命名法，首字母小写，之后每个单词首字母大写
####大驼峰：类名使用大驼峰命名法，首字母大写，之后每个单词首字母大写
####malloc对分配的区域不会初始化
####calloc对分配的区域进行初始化，全部置0
