import java.io.*;
import java.sql.SQLOutput;
import java.time.Instant;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Instant str = Instant.now();
        String st = str.toString();
        System.out.println(st.substring(0,4));
        System.out.println(st.substring(5,7));
        System.out.println(st.substring(8,10));
    }

}







