package WorkDay3.AnimalAndFridge;

class Elephant {

  int heightInCM;
}

class Fridge {

  int heightInCM;
  Elephant storageElephant;
  Lion storageLion;//方法名不能一样

  void store(Elephant elephant) {

    if(storageElephant != null){
      System.out.println("已装入狮子冰箱已满");
    }else {
      storageElephant = elephant;
      System.out.println("装入大象");
    }
  }
  void store(Lion lion){
    if (storageLion != null){
      System.out.println("已装入大象冰箱已满");
    }else{
      storageLion = lion;
      System.out.println("装入狮子");
    }
  }
  public void remove(Elephant elephant){
    storageElephant = null;
    System.out.println("大象从冰箱取出");
  }
}
class Lion{
  int heightInCM;
}

class ObjectDemo {
  static Elephant createElephant(int heightInCM) {
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
    // 使用定义的类作为数据类型
    // 使用new 创建一个对象（实例）
    Elephant elephant = new Elephant();
    // 使用. 访问对象的属性，可以对属性赋值或使用
    elephant.heightInCM = heightInCM;
    return elephant;
  }

  static Fridge createFridge(int heightInCM) {
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
    Fridge fridge = new Fridge();
    fridge.heightInCM = heightInCM;
    return fridge;
  }
  static Lion createLion(int heightInCM){
    System.out.printf("创建一个狮子，高度%d厘米\n",heightInCM);
    Lion lion = new Lion();
    lion.heightInCM = heightInCM;
    return lion;
  }

  static void putInElephant(Elephant elephant, Fridge fridge) {
    System.out.printf("把%d厘米高的大象装进%d厘米高的冰箱\n", elephant.heightInCM, fridge.heightInCM);
    if(elephant.heightInCM < fridge.heightInCM) {

      // 使用对象方法
      fridge.store(elephant);
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge.storageElephant.heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }

  }

  static void putInLion(Lion lion,Fridge fridge) {
    System.out.printf("把%d厘米高的狮子装进%d厘米高的冰箱\n", lion.heightInCM, fridge.heightInCM);
    if(lion.heightInCM < fridge.heightInCM){
      fridge.store(lion);

    }else {
      System.out.println("冰箱装不下了");
    }
  }

  public static void main(String[] args) {
    Elephant elephant = createElephant(300);
    Fridge fridge = createFridge(500);
    putInElephant(elephant, fridge);
    Lion lion = createLion(200);
    putInLion(lion,fridge);
    fridge.store(lion);
  }
}
