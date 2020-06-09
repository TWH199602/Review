package WorkDay2;
//    3456789 分钟
//    3456789 分钟是6年210天
public class Year {
  void convert(long minute){
    int year = (int) (minute/(365 * 24 * 60));
    int day = (int) ((minute%(365 * 24 * 60))/(24 * 60));
    System.out.println(" 分钟是"+minute+"年"+year+ "天"+day);
  }

}
