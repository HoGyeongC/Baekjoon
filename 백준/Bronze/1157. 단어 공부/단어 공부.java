import java.util.Scanner;

class countMax{
    String str;

    countMax(String str) {
        this.str = str;
    }

    int count() {
        int[] array = new int[26];
        for (int i = 0; i < 26; i++)
            array[i] = 0;

        int N = str.length();
        for(int i=0;i<N;i++){
            array[str.charAt(i) - 'A'] += 1;
        }

        int Max = 0, flag=0;
        for(int i=0;i<26;i++){
            if(Max < array[i]) {
                Max = array[i];
                flag=i;
            }
            else if(Max == array[i])
                flag=1;
        }
        if(flag==1)
            return -1;
        else
            return flag;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        str = scanner.next();

        int N = str.length();
        str = str.toUpperCase();

        countMax count = new countMax(str);
        int t = count.count();

        if(t==-1)
            System.out.println("?");
        else
            System.out.println((char)(t+'A'));


    }
}