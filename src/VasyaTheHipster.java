import java.util.Arrays;
import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int count=0;
        //int[] bb = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int max= a[0];
        int min = a[0];
        for (int i = 1; i < n ; i++) {
            if(max< a[i]){
                max=a[i];
                count++;
            } else if(min>a[i]){
                min = a[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
