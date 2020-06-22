package WorkDay11.Cake;

/**
 * 基于Cake类和下表，定义两个子类，OrderCake和ReadyMadeCake。
 *
 *              OrderCake	    ReadyMadeCake
 * 属性	        weightInKG	    quantity
 * 价格计算方法	price*weight	price*quantity
 * 通过使用定义的类，编写一个应用程序，它将：
 *
 * 声明一个由10个Cake对象组成的数组；
 * 输入Cake对象的数据并将其存储到数组中；
 * 显示所有蛋糕的总价；
 * 显示ReadyMadeCake蛋糕的总价和数量之和；
 * 显示最高价格出售的蛋糕的信息。
 */

public abstract class Cake {

    protected int id;
    protected double price;

    public Cake(int n, double r) {//构造方法，未被子类继承；
        id = n;
        price = r;
    }

    public abstract double calcPrice();

    @Override
    public String toString() {
        return id + "\t" + price;
    }
}
