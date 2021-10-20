import java.math.BigInteger;
import java.util.*;
public class Baekjoon19944 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        //뉴비는 1,2학년, 올드비는  N학년 이하이면서 뉴비가 아닌 학생
        // TLE는 뉴비도 아니고 올드비도 아님
        int n = Sc.nextInt();
        int m = Sc.nextInt();
        if (m == 1 || m == 2) System.out.println("NEWBIE!");
        else if (m <= n && (m != 1 && m != 2)) System.out.println("OLDBIE!");
        else System.out.println("TLE!");
    }
}