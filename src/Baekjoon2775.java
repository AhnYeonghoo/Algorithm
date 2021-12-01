package Baekjoon;

import java.io.*;

public class Baekjoon2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] apt = calc();

        for(int i = 0 ; i < t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(apt[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static int[][] calc(){
        int[][] arr = new int[15][15];

        for(int i = 1; i < 15; i++){
            arr[0][i] = i;  //0층 1 ~ 14호 인원
            arr[i][1] = 1;  //1 ~ 14층 1호의 인원
        }
        for(int i = 1; i < 15; i++)
            for(int j = 2; j < 15; j++)
                arr[i][j] = arr[i-1][j] + arr[i][j-1];

        return  arr;
    }
}
