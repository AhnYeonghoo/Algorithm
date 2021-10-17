import java.util.*;
public class Baekjoon10699 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DATE);
        System.out.println(year+"-"+month+"-"+day);

    }

}