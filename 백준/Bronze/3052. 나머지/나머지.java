import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for(int i=0;i<10;i++)
            array[i] = scanner.nextInt();

        for(int i=0;i<10;i++)
            array[i] %= 42;

        int cnt=10;
        for(int i=0;i<10;i++){
            if(array[i]!=-1) {
                for (int j = i + 1; j < 10; j++) {
                    if(array[i]==array[j]){
                        cnt-=1;
                        array[j] = -1;
                    }

                }
            }
        }

        System.out.println(cnt);
    }
}