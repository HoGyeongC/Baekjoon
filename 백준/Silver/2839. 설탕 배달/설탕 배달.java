import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //설탕 N킬로그램 중 3킬로그램과 5킬로그램 봉지를 배달할 때 가장 적은 갯수의 봉지를 배달하는 방법을 찾는 문제

        int N = Integer.parseInt(br.readLine());

        int k_3 = 0, k_5 = N/5; //k_5와 k_3은 각각 5kg, 3kg 봉지의 갯수
        //5kg 봉지를 사용할 수 있는 최대갯수부터 한봉지씩 줄이면서 계산

        int min = -1; //최소로 배달할 수 있는 설탕봉지의 갯수
        while(k_5>=0){ //사용할 수 있는 5kg 봉지의 최대 갯수부터 0개를 사용할 때까지 계산
            int M = N - (k_5*5); //5kg 봉지를 사용하고 남은 설탕의 양
            if(M%3==0) { //3kg 봉지로 정확하게 남은 설탕을 모두 배달할 수 있을 때
                k_3 = M / 3;
                if (min > k_3 + k_5 || min == -1) //최소 갯수의 설탕봉지 갯수 저장
                    min = k_3 + k_5;
            }
            k_5--; //5kg 봉지 갯수 감소

        }

        bw.write(min+"\n");

        bw.flush();
        bw.close();

    }
}