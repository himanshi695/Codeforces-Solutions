import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        //System.out.println(a);
        int sum=0;
        for (int i = 0; i < n-1 ; i++) {
            sum=sum+a[n-1]-a[i];
        }
        System.out.println(sum);


    }
}
