package WorkDay11.Cake;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[10];
//        cakes[0] = new OrderCake(1,10,10);
//        cakes[1] = new ReadyMadeCake(2,10,10);
        Random random= new Random(10);
        for (int i = 0; i <cakes.length ; i++) {
            if(i % 2 == 0) {
                cakes[i] = new OrderCake(i, random.nextDouble()*20, random.nextInt(20));
            }else   {
                cakes[i] = new ReadyMadeCake(i,random.nextDouble()*20,random.nextInt(20));
            }
        }
        double total = 0.0;
        for(Cake cake : cakes){
           total += cake.calcPrice();


        }
        System.out.println(total);
        double readMadeCakePriceTotal = 0.0;
        int readMadeCakeQuantityTotal = 0;
        for (Cake cake:cakes){
            if(cake instanceof ReadyMadeCake) {
                ReadyMadeCake readyMadeCake = (ReadyMadeCake) cake;
                readMadeCakeQuantityTotal += readyMadeCake.getQuantity();
                readMadeCakePriceTotal += readyMadeCake.calcPrice();
            }

        }
        double orderCakePriceTotal = 0.0;
        int orderCakeWhightInKGTotal = 0;
        for (Cake cake:cakes){
            //判断 对象：cake 是否是 类：OrderCake 的对象；
            if(cake instanceof OrderCake) {
                OrderCake orderCake = (OrderCake) cake;
                orderCakePriceTotal += orderCake.calcPrice();
                orderCakeWhightInKGTotal += orderCake.getWhightInKG();
            }
        }
        System.out.println("readyMadeCake:总价" + readMadeCakePriceTotal);
        System.out.println("readyMadeCake:数量" + readMadeCakeQuantityTotal);
        System.out.println(orderCakePriceTotal);
        System.out.println(orderCakeWhightInKGTotal);
    }
}
