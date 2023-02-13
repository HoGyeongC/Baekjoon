import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int len = str.length();

        int[] arr = new int[26];
        for(int i=0;i<26;i++)
            arr[i]=-1;

        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            int n = c-'a';
            if(arr[n]==-1)
                arr[n]=i;
        }

        for(int i=0;i<26;i++)
            System.out.print(arr[i]+" ");

    }
}