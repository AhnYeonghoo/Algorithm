import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner Sc = new Scanner(System.in);
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = Bf.readLine().split("/");
        int k = Integer.parseInt(temp[0]);
        int d = Integer.parseInt(temp[1]);
        int a = Integer.parseInt(temp[2]);
        if (k+a < d || d == 0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}








