import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        str = scanner.nextLine();

        String[] array = str.split(" ");
        int N = array.length;
        if (N!=0) {
            if (array[0].equals(""))
                N -= 1;
            if (array[array.length - 1].equals(""))
                N -= 1;
        }
        System.out.println(N);

    }
}