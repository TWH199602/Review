package WorkDay15.WeekDay;

/**
 * @author edz
 */
public enum WeekDay {
    /**
     *
     */
    MONDAY("周一", 1),
    TUESDAY("周二", 2),
    WEDNESDAY("周三", 3),
    THURSDAY("周四", 4),
    FRIDAY("周五", 5),
    SATURDAY("周六", 6),
    SUNDAY("周日", 7),
    ;

    private final String name;
    private final int code;

    WeekDay(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name + code;
    }

    public static WeekDay valueOfName(String name) {
        WeekDay[] values = values();
        for (WeekDay value : values) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }

    public static boolean isWeekday(int code) {
//        for(WeekDay value : values){
        return code <= FRIDAY.ordinal();

    }

    public static boolean isHolyday(int code) {
        return !isWeekday(code);

    }

    public static void printIsWeekday(int code) {
        if (isWeekday(code)) {
            System.out.println(WeekDay.values()[code - 1] + "是工作日");
        } else {
            System.out.println(WeekDay.values()[code - 1] + "是假日");
        }

    }
//    public static int printisholyday(int code) {
//       if(WeekDay(isholyday(code))){
//
//       }
//    }
//    public static int compareto(int code) {
//        WeekDay[] values = values();
//        for(WeekDay value : values) {
//            if(value.code < SATURDAY.code){
//                return -1;
//            }
//            else if(value.code > SATURDAY.code){
//                return 1;
//
//            }else {
//                return 0;
//            }
//        }
//        return 2;
}

