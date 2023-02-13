import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]= scanner.nextInt();
        int max=arr[0];
        int min=arr[0];
        for(int i:arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        System.out.println(min + " " + max);

    }
}