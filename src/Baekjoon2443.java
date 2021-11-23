package Baekjoon;
import java.lang.*;
import java.io.*;

public class Baekjoon2443 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = "";

        br.close();
        for (int i = n - 1; i >= 0; i--) {

            for (int j = n - 1; j > i; j--) {
                s += " ";
            }

            for (int k = 0; k <= (i * 2); k++) {
                s += "*";
            }
            s += "\n";
        }
        bw.write(s);
        bw.flush();
        bw.close();
    }
}