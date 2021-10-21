import java.util.*;
public class Baekjoon10093 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int count = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        } else if (a==b) {
            System.out.println("0");
        }
        for (int i = a+1; i < b; i++) {
            if (!(a==b))
                count++;
        }
        if (!(a==b))
            System.out.println(count);
        for (int i = a+1; i < b; i++) {
            if (a==b) break;
            else if (i == b-1) System.out.print(i);
            else
                System.out.print(i+" ");
        }
    }
}
