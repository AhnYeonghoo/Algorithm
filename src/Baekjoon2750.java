import java.util.*;
public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Sc.nextInt();
        }
        for (int i = 0; i <= num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for (int s : num) {
            System.out.println(s);
        }
    }
}