import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //브루트포스 알고리즘, 모든 경우의 수를 전부 생각해보면서 요구 조건에 충족되는 결과를 가져오는 알고리즘

        int N = Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=666;cnt<N;i++){ //종말의 수 중 가장 작은 수인 666부터 N번째 종말의 수가 나올 때까지 반복
            if(Integer.toString(i).contains("666"))
                cnt++;
            if(cnt==N) //N번째 종말의 수를 찾아내면 반복문 종료, 출력
                bw.write(i+"\n"); 
        }

        bw.flush();
        bw.close();

    }
}