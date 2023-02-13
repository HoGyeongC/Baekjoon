import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N,M;
        while(true){
            N= scanner.nextInt();
            M= scanner.nextInt();
            if(N==0 && M==0)
                break;
            System.out.println(N+M);
        }

    }
}