import java.io.*;
import java.util.*;
public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // readLine은 String이기 때문에 정수형으로 형변환
        PriorityQueue<Integer> q = new PriorityQueue<>(); //우선순위 큐 선언
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(br.readLine())); //따로 변수 선언 없이 우선순위 큐
            // 메서드를 이용해서 큐에 정수 입력받아 저장
        }
        while(!q.isEmpty())
            bw.write(String.valueOf(q.poll()) + "\n"); 
        /* poll은 제일 우선순위 높은 큐만 출력하므로 while문 통해서 
        큐 안이 모두 빌 때 까지 출력, 단 write 메서드는 String 타입의 문자열만
        출력해주므로 int형인 큐를 출력하려면 String형으로 형변환 해주고
        + 띄어쓰기 해주어야 함
         */
        bw.flush(); //write로 출력 후 남은 버퍼까지 모두 출력해주고
        bw.close(); //닫기
    }
}