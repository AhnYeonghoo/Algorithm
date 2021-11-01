import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon15873 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int sum = 0;
        if(length == 2){
            sum = str.charAt(0) + str.charAt(1) - 96;
        } else if(length == 3) {
            if(str.charAt(1) == '0')
                sum = str.charAt(2) - 38;
            else
                sum = str.charAt(0) - 38;
        } else
            sum = 20;
        sc.close();
        System.out.println(sum);


    }
}
