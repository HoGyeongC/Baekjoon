import java.io.*;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //두 자연수를 입력받고 최대 공약수와 최소 공배수를 찾는 문제

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //두개의 수 입력
        int B = Integer.parseInt(st.nextToken());

        //최대 공약수
        int min = Math.min(A,B); //둘 중 작은수부터
        for(int i=min; i>=1;i--){ //1이될 때까지 모든 수를 탐색
            if(A%i==0 && B%i==0) { //가장 큰 공약수가 나오면 출력하고 반복문 종료
                bw.write(i+"\n");
                break;
            }
        }
        
        //최소 공배수
        int max = Math.max(A,B); //둘 중 큰 수부터
        for(int i=max;;i++){
            if(i%A==0 && i%B==0) { //1씩 증가하면서 가장 작은 공배수가 나오면 출력하고 반복문 종료
                bw.write(i+"\n");
                break;
            }
        }

        bw.flush();
        bw.close();

    }
}