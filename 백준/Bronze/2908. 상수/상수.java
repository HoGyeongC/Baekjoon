import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();

        int M1,M2;
        M1=0;
        M2=0;
        for(int i=1;i<=100;i*=10){
            int tmp = N1/i%10;
            M1+=tmp;
            M1*=10;
        }
        M1/=10;

        for(int i=1;i<=100;i*=10){
            int tmp = N2/i%10;
            M2+=tmp;
            M2*=10;
        }
        M2/=10;

        System.out.println(Math.max(M1,M2));

    }
}