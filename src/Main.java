import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] number;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine().split(" ");
        for (String x : number) {
            int s = Integer.parseInt(x);
            result += (s * s);
        }
        result %= 10;
        System.out.println(result);





    }
}
