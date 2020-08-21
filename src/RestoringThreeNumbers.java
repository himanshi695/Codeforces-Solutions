import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[4];
        p[0] = sc.nextInt();
        p[1]= sc.nextInt();
        p[2]=sc.nextInt();
        p[3] = sc.nextInt();
        sc.nextLine();
        Arrays.sort(p);
        int q[] = new int[3];
        for (int i = 0; i < 3 ; i++) {
            q[i] = p[3] - p[i];
        }
        for (int i = 0; i < 3 ; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
