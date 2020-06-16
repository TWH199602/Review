package WorkDay6.StrBuffer;

import java.lang.Integer;
import java.util.Scanner;
public class StrBuffer {
  private char[] str;
  private int capacity = 10;
  private int length = 0;

  public void StrBuffer1(){
    this.str = new char[capacity];
  }
  public String toString(){
    return new String(str);
  }

  public void clear(){
    capacity = 10;
    this.str = new char[capacity];
    length = 0;
  }
  public void reverse(){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个字符串");
    String line = sc.nextLine();
    char[] arr = line.toCharArray();
    String s = "";
    for (int i = arr.length-1; i >= 0; i--) {
      s = s + arr[i];				//从后往前倒着拼接
    }
    System.out.println(s);

  }

  }



