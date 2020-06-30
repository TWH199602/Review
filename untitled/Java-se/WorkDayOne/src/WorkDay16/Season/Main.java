package WorkDay16.Season;

public class Main {
    public static void main(String[] args) {
        for (Season value : Season.values()) {
                switch (value){
                    case SPRING:
                        System.out.println(Season.SPRING + "3-5");
                        break;
                    case SUMMER:
                        System.out.println(Season.SUMMER + "6-8");
                        break;
                    case AUTUMN:
                        System.out.println(Season.AUTUMN + "9-11");
                        break;
                    case WINTER:
                        System.out.println(Season.WINTER + "12-2");
                        break;
                    default:
                        break;
                }
            }
            }

        }
