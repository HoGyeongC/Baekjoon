import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //K개의 랜선을 N개로 나눌 수 있는 최대 길이를 찾는 문제
        //이분탐색 사용

        int N = Integer.parseInt(br.readLine());
        int K;
        for(int i=1;;i++){
            int j=1;
            int n = 0;
            while(j<=i){
                int M = (i/j);
                n += (M%10);
                j*=10;
            }
            if(i+n == N) {
                K = i;
                break;
            }
            if(i>N) {
                K = 0;
                break;
            }
        }

        bw.write(K+"\n");


        bw.flush();
        bw.close();

    }
}