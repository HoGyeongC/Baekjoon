import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] before;

        int N = scanner.nextInt();
        before = new double[N];
        for(int i=0;i<N;i++){
            before[i] = scanner.nextDouble();
        }

        double max = before[0];
        for(double i : before){
            max = Math.max(i,max);
        }

        double[] after = new double[N];
        for(int i = 0; i<N;i++){
            after[i] = before[i]/max*100;
        }

        double avg = 0;
        for(double i:after)
            avg+=i;

        avg/=N;

        System.out.println(avg);

    }
}