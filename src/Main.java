import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int minIn = Sc.nextInt();
        int minMath = Sc.nextInt();
        int minS = Sc.nextInt();
        int minEn = Sc.nextInt();
        int manIn = Sc.nextInt();
        int manMath = Sc.nextInt();
        int manS = Sc.nextInt();
        int manEn = Sc.nextInt();
        int minResult = minIn + minMath + minS + minEn;
        int manResult = manEn + manMath + manIn + manS;
        if ( minResult > manResult)
            System.out.println(minResult);
        else if (minResult == manResult)
            System.out.println(minResult);
        else
            System.out.println(manResult);
    }
}








