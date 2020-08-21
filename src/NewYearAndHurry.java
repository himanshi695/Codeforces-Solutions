import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int a = 240-k;
        int sum=0;
        int count=0;
        int b=0;
        if (k<240){
            for (int i = 1; i <= n ; i++) {
                    b=5*i;
                    sum=sum+b;
                    if (sum<=a){
                        count++;
                    }
            }

        }
        System.out.println(count);
    }
}

