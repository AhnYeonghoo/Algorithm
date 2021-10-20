import java.util.*;
public class Baekjoon10817 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        String[] str = Sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        if (a >= b && a <= c ) {
            System.out.println(a);
        } else if (a <= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b <= c)
            System.out.println(b);
        else if (b >= c && b <=a) {
            System.out.println(b);
        } else
            System.out.println(c);
    }
}