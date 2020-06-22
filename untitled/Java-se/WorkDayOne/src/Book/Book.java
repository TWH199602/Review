package Book;
import java.lang.String;
public class Book {
    private static String name;
    private static int price;
    private static int cost;
    private static int pages;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Book.name = name;
    }

    public static void setPrice(int price) {
        Book.price = price;
    }

    public static void setCost(int cost) {
        Book.cost = cost;
    }

    public static void setPages(int pages) {
        Book.pages = pages;
    }

    public int profit(Book book){
       int profits = price - cost ;
        return profits;


    }
}
