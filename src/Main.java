import java.beans.ConstructorProperties;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a,b, sum = 0;
        for (int i = 1; i <= n; i++ ){
            a = Sc.nextInt();
            b = Sc.nextInt();
            sum = a+b;
            System.out.println("Case #"+i+":"+" "+a+" + "+b+" = "+ sum);
        }
    }
}










