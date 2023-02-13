import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B,C;
        int[] num = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        int N = A*B*C;

        int i=10;
        while(N>0){
            int M = N%i;
            num[M] +=1;
            N/=i;
        }
        for(i=0;i<10;i++)
            System.out.println(num[i]);
    }
}