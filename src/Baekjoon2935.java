import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Baekjoon2935 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        char ch =sc.next().charAt(0);
        BigInteger b = sc.nextBigInteger();
        if (ch == '*')
            System.out.println(a.multiply(b));
        else
            System.out.println(a.add(b));


    }
}