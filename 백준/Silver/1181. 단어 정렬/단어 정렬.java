import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i=0;i<N;i++){
            arr[i] = br.readLine();
        }

        String tmp, front;
        int fnum;
        for(int i=0;i<N;i++){
            front = arr[i];
            fnum = i;
            if(front.equals(""))
                continue;
            for(int j=i+1;j<N;j++){
                if(front.length() > arr[j].length() || (front.length() == arr[j].length() && front.compareTo(arr[j])>0)){
                    fnum = j;
                    front = arr[j];
                }
                else if(front.equals(arr[j])) {
                    arr[j] = "";
                }
            }
            tmp = arr[fnum];
            arr[fnum] = arr[i];
            arr[i] = tmp;
        }

        for(int i=0;i<N;i++){
            if(!arr[i].equals(""))
                bw.write(arr[i]+"\n");
        }


        bw.flush();
        bw.close();

    }
}