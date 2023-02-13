import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] music = new int[8];

        for(int i=0;i<8;i++)
            music[i] = scanner.nextInt();

        int flag = 0;
        if(music[0]==1) {
            flag=2;
            for (int i = 1; i <= 8; i++) {
                if (i != music[i-1]) {
                    flag = 1;
                    break;
                }
            }
        }
        else if(music[0]==8){
            flag=3;
            for(int i=8;i>=1;i--){
                if(i!=music[8-i]){
                    flag=1;
                    break;
                }
            }
        }
        else
            System.out.println("mixed");

        if(flag==1) {
            System.out.println("mixed");
        }
        else if (flag==2)
            System.out.println("ascending");
        else if(flag==3)
            System.out.println("descending");
    }
}