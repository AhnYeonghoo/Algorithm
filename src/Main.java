import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        BigDecimal n = Sc.nextBigDecimal();
        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");
        BigDecimal result = (one.divide(two.pow(n.intValue())));
        System.out.println(new BigDecimal(result.toString()).toPlainString());


    }


}







