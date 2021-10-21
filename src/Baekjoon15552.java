import java.io.*;

import java.util.*;
public class Baekjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter Bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(Bf.readLine());
        int a,b;
        String temp;
        for (int i = 0; i < n; i++) {
            temp = Bf.readLine();
            StringTokenizer St = new StringTokenizer(temp);
            a = Integer.parseInt(St.nextToken());
            b = Integer.parseInt(St.nextToken());
            Bw.write(a+b +"\n");
        }
        Bw.flush();
        Bw.close();



    }
}