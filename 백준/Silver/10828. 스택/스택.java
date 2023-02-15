import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str = br.readLine();
            String[] cmd = str.split(" ");
            if(cmd[0].equals("push")){
                stack.push(Integer.parseInt(cmd[1]));
            }
            else if(cmd[0].equals("pop")){
                if(stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(stack.pop()+"\n");
            }
            else if(cmd[0].equals("size"))
                bw.write(stack.size()+"\n");
            else if(cmd[0].equals("empty")){
                if(stack.empty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(cmd[0].equals("top")) {
                if(stack.empty())
                    bw.write("-1\n");
                else
                    bw.write(stack.peek()+"\n");
            }
        }


        bw.flush();
        bw.close();

    }
}