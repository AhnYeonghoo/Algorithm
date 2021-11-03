import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon2562 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int m = arr[0];
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= m) {
                m = arr[i];
                c = i+1;
            }
        }
        System.out.println(m);
        System.out.println(c);
    }

}