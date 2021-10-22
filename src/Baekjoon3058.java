import java.util.*;
public class Baekjoon3058 {
    public static void main(String[] args)  {
        Scanner Sc = new Scanner(System.in);
        int sum = 0;
        int n = Sc.nextInt();
        int min = Integer.MAX_VALUE;
        while(n!=0) {
            sum = 0;
            min = Integer.MAX_VALUE;
            for (int i = 0; i < 7; i++) {
                int a = Sc.nextInt();
                if (a % 2 == 0) {
                    sum += a;
                    if (a < min)
                        min = a;
                }
            }
            n--;
            System.out.println(sum+" "+min);
        }


    }
}