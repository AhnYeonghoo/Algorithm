import java.util.*;
public class Baekjoon2480 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        int result = 0;
        if (a==b && a==c) {
            result = 10000 + a * 1000;
        } else if ((a==b || b==c) || a==c) {
            if (a==b) result = 1000 + a * 100;
            else if (b==c) result = 1000 + b * 100;
            else result = 1000 + c * 100;
        } else {
            if (a > b && a > c) result = a *100;
            else if (b > a && b > c) result = b * 100;
            else  result = c * 100;
        }
        System.out.println(result);
    }
}

