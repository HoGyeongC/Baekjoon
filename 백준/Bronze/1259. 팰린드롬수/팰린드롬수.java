import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        while(!num.equals("0")){
            int len = num.length();
            int flag = 0;
            for(int i=0;i<len/2;i++){
                if(num.charAt(i) != num.charAt(len-i-1)){
                    flag=1;
                    break;
                }
            }
            if(flag==0) bw.write("yes\n");
            else    bw.write("no\n");
            num = br.readLine();
        }

        bw.flush();
        bw.close();

    }
}