import java.util.*;
public class Baekjoon13752 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int c[] = new int[n];
        String[] str = new String[n];
        for (int i = 0; i < n; i++ ) {
            c[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = c[i]; j > 0; j--) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}