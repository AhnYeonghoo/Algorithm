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
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] str = new String[num+1];
        for(int i = 0; i < num; i++) {
            int count = 0;
            int sum = 0;
            str[i] = sc.next();
            for(int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O')
                    sum += ++count;
                else
                    count = 0;
            }
            System.out.println(sum);
        }
    }
}




