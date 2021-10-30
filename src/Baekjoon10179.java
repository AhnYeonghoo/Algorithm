import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon10179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            System.out.println("$" +String.format("%.2f", d-d*0.2));
        }

        //로직은 내가 생각했는데 핵심 기능은 String.format()
        //첫번째 인자로 %.xf 지정하면 x만큼 반올림하여 출력해주고
        //두번째 인자로는 값을 넣어주면 된다.
    }
}
