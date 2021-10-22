import java.math.BigInteger;
import java.util.*;
public class Baekjoon1247 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            BigInteger result = new BigInteger("0");
            BigInteger be = new BigInteger("0");
            int n = Sc.nextInt();
            for (int j = 0; j < n; j++) {
                BigInteger s = Sc.nextBigInteger();
                result = result.add(s);
            }
            if (result.compareTo(be) == 0) System.out.println("0");
            else if(result.compareTo(be) == -1) System.out.println("-");
            else System.out.println("+");
        }


    }
}