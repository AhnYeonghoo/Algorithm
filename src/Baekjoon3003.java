import java.io.*;
import java.util.*;
import java.lang.*;
public class Baekjoon3003 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = 1, q = 1, L = 2, b = 2, n = 2, p = 8;
        int[] count = new int[6];
        for (int i = 0; i < count.length; i++) {
            count[i] = Integer.parseInt(br.readLine());
            System.out.println(count[i]);
        }*/
        Scanner sc = new Scanner(System.in);
        int [] num = {1,1,2,2,2,8};
        int[] count = new int[6];
        for (int i = 0; i < count.length; i++) {
            count[i] = sc.nextInt();
            System.out.print(num[i] - count[i] + " ");
        }

    }
}
