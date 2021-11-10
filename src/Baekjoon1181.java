import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;
public class Baekjoon1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> ls = new ArrayList<String>(20010);

        /*
            문자열들을 n번 입력받고 생성해놓은 String 타입의 배열들에 중복되는 값들은
            거르고 list에 추가
         */
        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            if(!ls.contains(temp))
                ls.add(temp);
        }
        /*
            길이를 비교하는 메서드 Comparator 인터페이스 구현체
         */
        Comparator<String> cs = new Comparator<String>() {
            public int compare(String x, String y) {
                if(x.length() > y.length()) {
                    return 1;
                } else if(x.length()==y.length()) {
                    return x.compareTo(y);
                }
                return -1;
            }
        };

        Collections.sort(ls, cs); //정렬 후 출력
        for(int i = 0; i < ls.size(); i++)
            System.out.println(ls.get(i));

    }




}
