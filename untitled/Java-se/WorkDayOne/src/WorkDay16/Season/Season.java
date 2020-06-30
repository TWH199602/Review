package WorkDay16.Season;

public enum Season {
    /**
     * @author
     * command + shift + U,切换单词大小写；
     */
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬"),
        ;

    private final String name;
    Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
