import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3 ; i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        Arrays.sort(a);
        sum=a[2]-a[1];
        sum=sum+a[1]-a[0];
        System.out.println(sum);

    }
}
