import java.util.HashSet;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int b;
        int d = 0;
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            b=sc.nextInt();
            sc.nextLine();
            if (b==1 || b==2){
                d=0;
            }
            if (b%2!=0){
                d=b/2;
            }
            if (b%2==0){
                d=(b/2)-1;
            }
            a[i]=d;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(a[i]);
        }

    }
}
