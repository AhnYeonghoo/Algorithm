import java.math.BigInteger;
import java.util.*;

public class Baekjoon1271 {
    public static void main(String[] args) {
        BigInteger number1, number2;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextBigInteger();
        number2 = sc.nextBigInteger();
        BigInteger result = number1.divide(number2);
        BigInteger result2 = number1.remainder(number2);;

        System.out.println(result);
        System.out.println(result2);

    }
}