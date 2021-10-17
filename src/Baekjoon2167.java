import java.util.*;
public class Baekjoon2167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();
        int arrNum2 = sc.nextInt();
        int[][] arr = new int[arrNum][arrNum2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int num = sc.nextInt();
        int[] sum = new int[num];
        int i = 0, j = 0, x = 0, y = 0;
        int n = 0;

        // (i,j) ~ (x,y)까지 범위 모두 더하기
        for(int m = 0; m < num; m++) {
            i = sc.nextInt();
            j = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            for (int q = i; q <= x; q++) {
                for (int p = j; p <= y; p++) {
                    sum[n] += arr[q-1][p-1];
                }
            }n++;
        }
        for (int h = 0; h < num; h++) {
            System.out.println(sum[h]);
        }

    }

}