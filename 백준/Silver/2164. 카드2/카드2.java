import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //N개의 정수 중 입력받은 수가 있는지 확인하는 문제

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }
        int i=0, cnt=0, cnt_0 = 0;
        while(true) {
            if (arr[i] != 0) {
                if (cnt_0 >= N - 1)
                    break;
                cnt_0 = 0;
                if (cnt % 2 == 0) {
                    arr[i] = 0;
                }
                cnt++;
            } else {
                cnt_0++;
            }
            i++;
            if (i >= N)
                i = 0;
        }
        bw.write(arr[i]+"\n");


        bw.flush();
        bw.close();

    }
}