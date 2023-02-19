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

        int N = Integer.parseInt(br.readLine()); //N개의 정수를 arr1배열에 저장
        String[] str = br.readLine().split(" ");
        int[] arr1 = new int[N];
        for(int i=0;i<N;i++)
            arr1[i] = Integer.parseInt(str[i]);

        int M = Integer.parseInt(br.readLine()); //M개의 정수를 arr2에 저장
        str = br.readLine().split(" ");
        int[] arr2 = new int[M];
        for(int i=0;i<M;i++)
            arr2[i] = Integer.parseInt(str[i]);


        for(int i=0;i<M;i++){ //arr2의 각각의 수가 arr1중에 있는지 찾는 문제이므로 하나씩 탐색
            int flag = 0;
            for(int j=0;j<N;j++){
                if(arr2[i] == arr1[j]) { //찾는 수가 나오면 arr1의 탐색은 종료 후 표시
                    bw.write(1 + "\n");
                    flag=1;
                    break;
                }
            }
            if(flag==0) //arr1에 찾는 수가 없으면 0 출력
                bw.write(0+"\n");
        }


        bw.flush();
        bw.close();

    }
}