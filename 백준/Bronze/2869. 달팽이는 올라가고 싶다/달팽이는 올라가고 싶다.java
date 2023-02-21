import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //하루에 A미터 올라가고 B미터 미끄러지는 달팽이가 V미터 올라가는데 며칠이 걸리는지 알아내는 문제
        //시간제한 0.25초

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken()); //한줄에 공백을 기준으로 A,B,V 입력

        int move = A-B; //달팽이가 하루에 총 올라가는 거리
        int des = V-B;  //달팽이는 정상에 도달하면 미끄러지지 않는다.
                        //하지만 move에서 밤에 미끄러지는 거리를 미리 계산했기 때문에 나무의 길이도 미리 미끄러지는 거리를 뺀다.
        
        int day = des/move; //총 길이를 하루에 움직이는 거리로 나눠서 올라가는데 걸리는 날짜 계산
        if(des%move!=0) //나머지가 있으면 올라갈 나무가 남아있다는 것이므로 하루 추가
            day++;

        bw.write(day+"\n");
        bw.flush();
        bw.close();


    }
}