
import java.util.*;
public class Baekjoon2010 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] a = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
            result += a[i];
        }
        System.out.println(result-n+1);



    }
}