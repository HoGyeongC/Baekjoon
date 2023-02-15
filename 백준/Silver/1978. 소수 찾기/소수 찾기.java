import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i=0;i<N;i++){
            if(isprime(arr[i])==1)
                cnt++;
        }
        bw.write(cnt + "\n");

        bw.flush();
        bw.close();

    }

    public static int isprime(int n){
        int[] arr = new int[n+1];

        if(n==1)
            return 0;
        
        for(int i=2;i<n;i++)
            if(n%i==0)
                return 0;

        return 1;
    }

}