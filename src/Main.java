import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        for(int i = 0 ; i < n; i++) {
            String str = br.readLine();
            result[i] = str.substring(0,1).toUpperCase() + str.substring(1);
        }
        br.close();
        for(String s : result)
            bw.write(s+"\n");

        bw.flush();
        bw.close();
    }
}




