import java.util.Scanner;pimport java.util.*;
public class Baekjoon10156 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int k = Sc.nextInt(); // 과자의 가격
        int n = Sc.nextInt(); // 사야될 과자의 개수
        int m = Sc.nextInt(); // 가지고 있는 돈
        // 받아야 할 돈
        if (k*n-m >= 0) {
            System.out.println (k * n - m);
        } else {
            System.out.println("0");
        }

    }
}