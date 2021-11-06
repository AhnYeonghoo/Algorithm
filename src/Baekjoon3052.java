import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon3052 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.print(h.size());
    }
}