package WorkDay15.Animal;

public class AnimalType {
    public static final AnimalType LION = new AnimalType("狮子",1);
    public static final AnimalType ELEPHANT = new AnimalType("大象",2);
    public static final AnimalType TIGER = new AnimalType("老虎",3);

    private String name;
    private int id;

    private AnimalType(String name,int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return name;
    }

    public static int valueof(int id) {
        if(LION.id == id) {
            return 1;
        }
        else if(ELEPHANT.id == id){
            return 2;
        }
        else if(TIGER.id == id){
            return 3;
        }else {
            return 0;
        }

    }

    public static AnimalType valueOf(String typeName) {
        if (LION.name.equals(typeName)) {
            return LION;
        } else if (ELEPHANT.name.equals(typeName)) {
            return ELEPHANT;
        } else if (TIGER.name.equals(typeName)) {
            return TIGER;
        }else {
            return null;
        }
    }
}