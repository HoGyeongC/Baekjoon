import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        scanner.nextLine();
        String str=scanner.nextLine();
        int sum=0;
        for(int i=0;i<N;i++) {
            arr[i] = (int)str.charAt(i) - '0';
            sum+=arr[i];
        }

        System.out.println(sum);

    }
}