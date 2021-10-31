import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String str = sc.nextLine();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(arr[ch-'a'] == -1)
                arr[ch-'a'] = i;
        }
        for(int s : arr)
            System.out.print(s + " ");

    }
}


