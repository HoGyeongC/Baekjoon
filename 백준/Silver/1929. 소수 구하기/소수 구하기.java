import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NM = bf.readLine();
        StringTokenizer st = new StringTokenizer(NM);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt;

        int[] array = new int[M+1];

        for(int i=2;i<=M;i++)
            array[i]=i;

        for(int i=2;i<=M;i++){
            if(array[i]==0) {
                continue;
            }
            else{
                for(int j=i+i;j<=M;j+=i)
                    array[j]=0;
            }
        }
        for(int i=N;i<=M;i++) {
            if(array[i]!=0)
                bw.write(array[i] + "\n");
        }

        bw.flush();
        bw.close();

    }
}