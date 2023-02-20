import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //세 변의 길이를 입력받고 각 변의 길이로 이루어진 삼각형이 직각 삼각형인지 알아내는 문제

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken()); //3개의 정수 A,B,C를 입력
        
        while(!(A==0&&B==0&&C==0)){ //A,B,C가 모두 0이되면 반복문 종료
            int max = Math.max(A,B);
            max = Math.max(max,C); //A, B, C 중 가장 큰 수를 찾기
            int tmp;

            if(max==A){  //A,B,C중 가장 큰 수를 C에 저장
                tmp = A;
                A = C;
                C = tmp;
            }
            else if(max==B){
                tmp = B;
                B = C;
                C = tmp;
            }

            if(C*C == A*A + B*B) //피타고라스의 정리를 이용해서 직각삼각형인지 여부를 확인
                bw.write("right\n");
            else
                bw.write("wrong\n");
            
            st = new StringTokenizer(br.readLine()," "); //새로운 3개의 수 입력
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
        }

        bw.flush();
        bw.close();

    }
}