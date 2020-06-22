//package WorkDay7.guess;
//import sun.font.FontRunIterator;
//
//import java.util.Scanner;
//public class GuessNumber {
//    public static void fillAnswer(int[] answer) {//有参的构造方法；数组【answer】为该方法的参数；
//        if(answer.length > 10) {
//            //如果answer数组的长度大于10则返回；
//            return;
//        }
//
//        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
//        //遍历数组下标；
//        for (int i = 0; i < answer.length; i++) {
//            //index = 数组随机下标对应的值；
//            int index = (int) (Math.random()*numbers.length - i);
//
//            answer[i] = numbers[index];
//            numbers[index] = numbers[numbers.length -i - 1];
//
//        }
//    }
//    public static boolean checkUserInput(int[] userInput,int[] answer) {
//        if(userInput.length != answer.length) {
//            return false;
//        }
//        int posCorrect = 0;
//        int valueCorrect = 0;
//        for (int i = 0; i <answer.length ; i++) {
//            if (answer[i] == userInput[i]) {
//                posCorrect++;
//                valueCorrect++;
//
//            }else {
//                if (toString(userInput).contains(answer[i] + "")){
//                    valueCorrect++;
//                }
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int [] answer = new int [4];
//        int [] userInput = new int [4];
//        fillAnswer(answer);
//        System.out.println("猜4个不重复的数字，请输入4个数字:");
//        while (true) {
//            fillUserInput(userInput);
//            boolean isSuccess = checkUserInput(userInput,answer);
//            if (isSuccess){
//                System.out.println("回答正确");
//                break;
//            }else {
//                System.out.println("请输入4个数字:");
//            }
//        }
//    }
//
//
//}
