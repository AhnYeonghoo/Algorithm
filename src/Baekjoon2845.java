package Baekjoon;
import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon2845 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[5];
        int m = l * p;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]-m+" ");
        }
    }
}