import java.util.*;
public class Baekjoon4101 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        while(true) {
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            if (a == 0 && b == 0 ) break;
            if (a > b)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
