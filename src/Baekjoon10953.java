import java.util.*;
public class Baekjoon10953 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = Sc.next();
            String[] arr = s.split(",");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}