import java.util.*;
public class Baekjoon4344 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int c = Sc.nextInt(); //처음 입력받을 수
        int[] score;
        for (int i = 0; i < c; i++) {
            int n = Sc.nextInt(); // 점수 입력 할 개수
            score = new int[n];
            int count = 0;
            double sum = 0;
            double result = 0;
            for (int j = 0; j < n; j++) {
                score[j] = Sc.nextInt();
                sum += score[j];
            }
            double avg = sum / n;
            for (int k = 0; k < n; k++) {
                if (score[k] > avg) count++;
            }
            result = ((double)count/n) * 100;
            System.out.printf("%.3f", result);
            System.out.println("%");
        }
        Sc.close();
    }

}
