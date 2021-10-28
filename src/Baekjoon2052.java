import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Baekjoon2052 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        BigDecimal n = Sc.nextBigDecimal();
        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");
        BigDecimal result = (one.divide(two.pow(n.intValue()))); // 1/2^-n을 계산
        System.out.println(new BigDecimal(result.toString()).toPlainString());
        //일반적으로 지수 표현을 제거하기 위해선
        //new BigDecimal 인스턴스를 생성해주고 그 안에 값을 넣어준다.
        //문자열 값에 toPlainString 메서드를 사용하면 E표기 없이
        // 순수하게 소숫점으로 결과값이 출력됨.


    }


}
