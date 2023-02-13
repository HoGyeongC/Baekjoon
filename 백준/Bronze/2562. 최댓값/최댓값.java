import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];
        int max=0, maxindex = -1;
        for(int i=0;i<9;i++) {
            array[i] = scanner.nextInt();
            if(array[i]>max) {
                max = array[i];
                maxindex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxindex + 1);
    }
}