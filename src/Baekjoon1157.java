import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class Baekjoon1157 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26]; // 영문자의 개수
        int max = -1; // 처음 비교를 위해
        char ch = '?';

        for(int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && 'Z' >= str.charAt(i))  //만약 해당 문자열 인덱스의 문자가 대문자면
                arr[str.charAt(i) - 'A']++; //ex B면 B-'A는 1이므로 arr[1]++, 즉 B를 카운팅
            else
                arr[str.charAt(i) - 'a']++; // 소문자라면 97을 빼준다
        }

        for(int i = 0; i < 26; i++) {
            if (arr[i] > max) {    //만약 카운팅된 문자가 max보다 크다면 처음엔 무조건 참
                max = arr[i]; //그 문자를 가르키는 arr[i]를 max에 대입
                ch = (char)(i + 65); // i는 0부터 26까지 A-Z(대소문자X) 돌며 참일 때 성립하므로 i가 곧 해당 알파벳을 의미하고
                // i+65를 하고 char로 형변환하면 아스키코드에 의해 해당 문자로 변환됨
            } else if (arr[i] == max) // 만약 max와 해당 배열의 카운팅된 수가 같다면 2개 이상이므로
                ch = '?'; // ? 출력
        }

        System.out.println(ch);
    }
}
