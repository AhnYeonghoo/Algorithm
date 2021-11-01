import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon5575 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < 3; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            LocalTime a = LocalTime.of(h1,m1,s1);
            LocalTime a1 = LocalTime.of(h2,m2,s2);
            long s = ChronoUnit.SECONDS.between(a,a1);
            long h = s/3600;
            s -= h*3600;
            long m = s/60;
            s -= m*60;
            System.out.printf("%d %d %d\n",h,m,s);
        }
        bw.flush();
        bw.close();
        br.close();

    }

}