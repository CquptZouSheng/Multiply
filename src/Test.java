import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Zou on 2016/10/18.
 */
public class Test {
    public static void main(String[] args) {
        int number, start, end;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number:");
        number = input.nextInt();
        System.out.println(result(number));
        System.out.println("Please input the number,start position and end posistion:");
        number = input.nextInt();
        start = input.nextInt();
        end = input.nextInt();
        System.out.println(subResult(number, start, end));
    }

    private static String subResult(int number, int start, int end) {
        return result(number).substring(start - 1, end);
        /*
            注释一个问题，subString方法截取的是start到end，从第0位开始，
            不包括第end位，这里考虑到使用习惯我改成了从第1位开始，包括第end位，例如输入10,2,3
            打印的就是3628800的第2,3位，即62。（感觉没什么意义还是提一下......）
        */
    }

    private static String result(int number) {
        BigInteger sum = new BigInteger("1");
        for (int i = number; i > 0; i--) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        return sum.toString();
    }
}
