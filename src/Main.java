import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = (int) (n*0.8);
        int result = (int)((n - temp) * 0.22);
        System.out.printf("%d %d", (int)(n*0.78),(int)((n-result)));


    }
}


