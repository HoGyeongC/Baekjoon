import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //자연수 N이 주어졌을 때 N의 가장 작은 생성자를 구하는 문제
        //브루트포스 사용

        int N = Integer.parseInt(br.readLine());
        int K;

        for(int i=1;;i++){ //i는 1부터 원하는 값이 나올 때까지 작업을 진행(브루트포스)
            int j=1;
            int n = 0;
            while(j<=i){ //i의 각 자릿수 합을 계산, n에 저장
                int M = (i/j);
                n += (M%10);
                j*=10;
            }
            if(i+n == N) { //i와 i의 각 자리수의 합(분해합)이 N과 같을 때(i가 N의 생성자일 때) 반복문 종료
                K = i; //K는 N의 가장 작은 생성자가 된다.
                break;
            }
            if(i>N) { //i가 N보다 커지면 N은 생성자가 없다
                K = 0;
                break;
            }
        }

        bw.write(K+"\n");


        bw.flush();
        bw.close();

    }
}