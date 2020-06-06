package club.banyuan.demo;

public class Student {

  public static void main(String[] args) {
    String[] student ={"","A","B","C",null};
//修改，把A修改成D
//先找到要修饰的元素所对应的下标，然后根据下标来修改
    int index = -1;
    for (int i = 0; i < student.length; i++) {
      if(student[i]!=null&&!student[i].equals("")){
        if(student[i].equals("A")){
          index = i;
          break;
        }
      }
    }
    student[index] = "D";
//移完之后查看
    for (int i = 0; i < student.length; i++) {
      System.out.print(student[i]+"\t");
    }
  }

  private static void delete(String[] student) {
//想把B删除掉
    int index = -1;
//1.先找到苹果所在的下标位置
    for (int i = 0; i < student.length; i++) {
//先做非空判断，然后再去比较，这样可提高代码的健壮性，避免NullPointException空指针异常
      if(student[i]!=null&&!student[i].equals("") ){
        if(student[i].equals("B")){
          index=i; //找到元素所对应的下标
          break;
        }
      }
    }
//把要删除的元素后面的元素往前移
    for (int i = index; i < student.length-1; i++) {
      student[i]=student[i+1];
    }
//移完之后查看
    for (int i = 0; i < student.length; i++) {
      System.out.print(student[i]+"\t");
    }
  }

  private static void add(String[] student) {
    int len = student.length;
    for (int i = 0; i < student.length; i++) {
      System.out.print(student[i]+"\t");
    }
    System.out.println();
//1.往数组里空的位置添加一个数据
//1.先去找数据里哪个位置是空的，如果找到就添加，如果没找到就不添加
//查找的时候也要通过循环查找
    int index = -1; //这个变量的作用就是把空位置的下标装起来，赋值为-1是为了区分开数组里的其他下标值
    for (int i = 0; i < len; i++) {
      if(student[i]==null){
        index = i; //如果下标i所对应的位置为空，就可以取出这个下标用来添加数据了

        break; //一旦找到空位，就跳出循环
      }
    }
    student[index] = "E"; //在数组里空的位置新添加了一个元素
    for (int i = 0; i < student.length; i++) {
      System.out.print(student[i]+"\t");
    }
  }
}



