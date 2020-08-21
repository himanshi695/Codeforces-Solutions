import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int count=0;
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            if (a[i]<5 && 5-a[i]>=k){
                count++;
            }
        }
        if (count<3){
            System.out.println("0");
        } else{
            System.out.println(count/3);
        }

    }
}
