import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon2744 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char[] result = new char[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(Character.isLowerCase(arr[i]))
                result[i] += Character.toUpperCase(arr[i]);
            else
                result[i] += Character.toLowerCase(arr[i]);
        }
        for(char s : result) {
            System.out.print(s+"");
        }
    }

}