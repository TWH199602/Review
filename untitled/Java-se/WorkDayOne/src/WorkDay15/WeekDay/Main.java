package WorkDay15.WeekDay;

public class Main {
    private static WeekDay Weekday;

    public static void main(String[] args) {
        System.out.println(WeekDay.MONDAY.name());
        System.out.println(WeekDay.TUESDAY);
        System.out.println(WeekDay.WEDNESDAY);
        System.out.println(WeekDay.THURSDAY);
        System.out.println(WeekDay.FRIDAY);
        System.out.println(WeekDay.SATURDAY);
        System.out.println(WeekDay.SUNDAY);
        for (WeekDay value : WeekDay.values()) {
            WeekDay.printIsWeekday(value.getCode());
        }


        WeekDay sat = WeekDay.SATURDAY;
        for (WeekDay day : WeekDay.values()) {
            System.out.print(day.compareTo(sat) + "");
            if (day.compareTo(sat) < 0) {
                System.out.println("小于sat");
            } else if (day.compareTo(sat) > 0) {
                System.out.println("大于sat");
            } else {
                System.out.println("等于sat");
            }

        }


    }
}
