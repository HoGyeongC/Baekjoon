import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //큐

        //자바의 Queuq 클래스를 사용(linkedList)
        Queue<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine()); //명령의 수

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            String command = st.nextToken();
            //Queue에 요소를 삽입
            if(command.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            }
            //Queue의 가장 앞의 요소 출력, 제거
            else if(command.equals("pop")){
                if(queue.isEmpty())
                    bw.write(-1 + "\n");
                else bw.write(queue.poll()+"\n");
            }
            //현재 Queue의 크기
            else if(command.equals("size")){
                bw.write(queue.size()+"\n");
            }
            //Queue가 비어있으면 1, 아니면 0출력
            else if(command.equals("empty")){
                if(queue.isEmpty())
                    bw.write(1+"\n");
                else bw.write(0+"\n");
            }
            //Queue의 가장 앞의 요소 출력
            else if(command.equals("front")){
                if(queue.isEmpty())
                    bw.write(-1 + "\n");
                else bw.write(queue.peek()+"\n");
            }
            //Queue의 가장 뒤의 요소 출력
            else if(command.equals("back")){
                if(queue.isEmpty()) 
                    bw.write(-1 + "\n");
                else{ //새로운 빈 Queue를 만들고 원래 Queue의 마지막 요소를 제외한 요소를 모두 옮김
                    Queue<Integer> q2 = new LinkedList<Integer>();
                    int size = queue.size();
                    for(int j=0;j<size-1;j++){
                        q2.add(queue.poll());
                    }
                    bw.write(queue.peek()+"\n"); //마지막 요소를 출력 후 전에 만든 새 Queue에 삽입
                    q2.add(queue.poll());
                    queue=q2; //새로 만든 기존의 Queue는 원래 Queue로 이동
                }
            }
        }


        bw.flush();
        bw.close();


    }
}