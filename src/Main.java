import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // 상품 고정비용
        long b = sc.nextLong(); // 상품 가변비용
        long c = sc.nextLong(); // 상품 판매수입
        int count = 0; //상품 판매대수
        long fixed = a;
        if (b >= c) {
            System.out.println(-1);
            return;
        }
        while (fixed >= count * c) {
                fixed += b;
                count++;
        }
        System.out.println(count);
    }
}







