import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);

            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour +" " + minute);
        } else {
            System.out.println(hour + " " + (minute-45));
        }
        sc.close();

    }
}
