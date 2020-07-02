package WorkDay16.Season.Cal.banyuan;

import java.util.Scanner;

/**
 * Calculator类提供了用于解析包含简单表达式的输入字符串以及计算表达式结果的功能。
 */

public class Calculator {

    public Calculator() {
    }

    /**
     * 0 个符号: IllegalInputException: "Illegal Token Length"
     * 1 个符号:
     * "quit" (不区分大小写): QuitException
     * 所有其他情况: IllegalInputException: "Illegal Argument"
     * 2 个符号:
     * "-" 和数字: 返回负数
     * "-" 和非数字: IllegalInputException: "Illegal Argument"
     * 其他字符串: IllegalInputException: "Illegal Operator"
     * 3 个符号:
     * 数字1, "+", 数字2: 返回两个数字的和
     * 数字1, "/", 0: DivideByZeroException
     * 数字1, "/", 非零数字:  返回两个数字的商
     * 非数字，其他输入，其他输入: IllegalInputException: "Illegal Argument"
     * 数字1, 其他输入, 非数字: IllegalInputException: "Illegal Argument"
     * 数字1, 非运算符, 数字2: IllegalInputException: "Illegal Operator"
     * 4 更多的运算符: IllegalInputException: "Illegal Token Length"
     * <p>
     * Note: 所有数字都是整数
     *
     * @param tokens 符号数组，包含用户输入的操作数或操作符
     * @return 计算表达式的结果
     * @throws CalculatorException 如果用户输入不合法，或者已键入“ quit”。抛出CalculatorException 的几个子类之一，以便提供有关错误原因的更多信息.
     */
    public static int compute(String[] tokens) throws CalculatorException, IllegalInputException, DivideByZeroException, QuitException {
        // 不同符号数量的各种情况
        switch (tokens.length) {
            case 0:
                // TODO: complete the cases
                throw new IllegalInputException("Illegal Token Length");


            case 1:
                // 只有一种情况，用户输入 quit
                // TODO: complete the cases
                // Scanner scanner = new Scanner(System.in);
                if (tokens[0].equalsIgnoreCase("quit")) {
                    throw new QuitException("QuitException");
                } else {
                    throw new IllegalInputException("Illegal Argument");
                }


            case 2:
                // 只有一种情况，用户输入 负数
                // TODO: complete the cases
//                if (!tokens[0].equals("-")) {
//                    throw new IllegalInputException("Illegal Argument");
//                }
//                if (!isInt(tokens[1])) {
//                    throw new IllegalInputException(""Illegal Argument"");
//                }
//                int num = Integer.parseInt(tokens[1]);
//                return -num;
                if("-".equals(tokens[0])){
                    return parseInt(tokens[1],true);
                }else {
                    throw new IllegalInputException("Illegal Argument");
                }

            case 3:
                // 计算表达式
                // TODO: complete the cases
                int a = parseInt(tokens[0]);
                int b = parseInt(tokens[2]);
                switch (tokens[1]) {
                    case "+":
                        return a + b;
                    case "-":
                        return a - b;
                    case "/":
                        if (b == 0) {
                            throw new DivideByZeroException("DivideByZeroException");
                        }
                        return a / b;
                    default:throw new IllegalInputException("Illegal Operator");
                }


//                if (isInt(tokens[0]) || "+".equals(tokens[1]) || isInt(tokens[2])) {
//                    int num1 = Integer.parseInt(tokens[0]);
//                    int num2 = Integer.parseInt(tokens[2]);
//                    return num1 + num2;
//                }
//                if (isInt(tokens[0]) || "/".equals(tokens[1]) || "0".equals(tokens[2])) {
//                    throw new DivideByZeroException("DivideByZeroException");
//                }
//                if (isInt(tokens[0]) || "/".equals(tokens[1]) || isInt(tokens[2])) {
//                    int num1 = Integer.parseInt(tokens[0]);
//                    int num2 = Integer.parseInt(tokens[2]);
//                    return num1 / num2;
//                }
//                if (!isInt(tokens[0]) || !isOperator(tokens[1]) || !isInt(tokens[2])) {
//                    throw new IllegalInputException("Illegal Argument");
//                }
//                if (isInt(tokens[0]) || !isOperator(tokens[1]) || !isInt(tokens[2])) {
//                    throw new IllegalInputException("Illegal Argument");
//                }
//                if (isInt(tokens[0]) || !isOperator(tokens[1]) || isInt(tokens[2])) {
//                    throw new IllegalInputException("Illegal Argument");
//                }

            default:
                // 4个或等多操作符号抛出异常
                // TODO: complete the cases
                throw new IllegalInputException("Illegal Token Length");

        }

    }

    /**
     * 将输入字符串解析为表达式并对其求值。
     * <p>
     * 如果输入是合法表达式，则打印结果
     * <p>
     * 否则抛出CalculatorException。根据异常类型打印消息。
     * <p>
     * 始终打印出输入内容。为此使用finally块。
     * <p>
     * 始终遵循以下规则打印两行：
     * 第一行:
     * -No Exception: "The result is: " + result
     * -QuitException: "Quitting"
     * -DivideByZeroException: "Tried to divide by zero"
     * -IllegalInputException: "Illegal input: " + illegalinputtype(given to constructor)
     * -CalculatorException: <should never happen> e.getMessage()
     * 第二行:
     * "Input was: " + input
     *
     * @param input 可能包含数学表达式的字符串
     * @return true 如果String等于"quit"; false 其他情况
     */
    public static boolean parseAndCompute(String input) throws DivideByZeroException,IllegalInputException {
        // 提取所有运算符号
        String[] tokens = input.split(" ");
        try {
//            int result = compute(tokens);
            System.out.println("the result is:" + compute(tokens));
            // TODO: complete implementation.
        } catch (QuitException e) {
            System.out.println("QUITTING\n" + "THANKS" );
            return true;
            // TODO: complete implementation.
        } catch (IllegalInputException e) {
            System.out.println("Illegal input:" + e.getMessage());
            // TODO: complete implementation.
        } catch (CalculatorException e) {
            // 这捕获了剩下的CalculatorException情况：DivideByZeroException
            // TODO: complete implementation.
            /**
             *  if (e instanceof DivideByZeroException){
             *                 System.out.println("Tried to divide by zero");
             *
             *             }
             *             finally{
             *                 if (tokens.length > 0 && !"quit".equalsIgnoreCase(tokens[0])) {
             *                     System.out.println("Input was:" + input);
             *                 }
             */

            }
            return false;
        }


        // TODO: complete implementation.

        // 未指定退出
//        return false;
//    }

    public static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Illegal Argument");
        }
    }

    public static int parseInt(String s ,boolean isNegative) throws IllegalInputException {
        if(isNegative){
            return -parseInt(s);
        }else {
            throw new IllegalInputException("Illegal Argument");
        }
    }

//    public static boolean isInt(String input) {
//        char[] chars = input.toCharArray();
//        for (char temp : chars) {
//            if (temp < 0 || temp > 9) {
//                return false;
//
//            }
//        }
//        return true;
//    }
//
//    public static boolean isOperator(String input) {
//        return input.equals("+") && input.equals("-") && input.equals("/");
//    }
}



