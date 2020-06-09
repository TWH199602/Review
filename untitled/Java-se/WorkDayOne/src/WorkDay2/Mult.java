package WorkDay2;
import java.util.Scanner;
public class Mult {

  static int multiply(int n1, int n2) {
    int rlt = 0;
    if (n1 > 0 && n2 > 0) {
      for (int i = 0; i <= n2; i++) {
        rlt += n1;
      }
    } else if (n1 < 0 && n2 < 0)
      ;
    n1 = -n1;
    n2 = -n2;
    for (int i = 0; i <= n2; i++) {
      rlt += n1;
    }
      if (n1 < 0 && n2 > 0) {
      n1 = -n1;
      for (int i = 0; i <= n2; i++) {
        rlt += n1;
      }
      rlt = -rlt;
    } else if (n1 > 0 && n2 < 0) {
      n2 = -n2;
      for (int i = 0; i <= n2; i++) {
        rlt += n1;
      }
      rlt = -rlt;
    }
     else if (n1 == 0 || n2 == 0){
       rlt = 0;
    }
     return rlt;

  }
}




