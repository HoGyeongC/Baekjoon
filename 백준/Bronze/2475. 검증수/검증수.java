import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] id = new int[5];

        for(int i=0;i<5;i++)
            id[i] = scanner.nextInt();

        int num = 0;
        for(int i=0;i<5;i++)
            num += id[i]*id[i];

        num%=10;

        System.out.println(num);

    }
}