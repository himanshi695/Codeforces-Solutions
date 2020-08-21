import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        sc.nextLine();
        int[] b = new int[a];
        int count=0;
        int sum=0;
        for (int i = 0; i < b.length ; i++) {
            b[i] = sc.nextInt();
        }

        for(int i=0;i<b.length ;i++){
            if(b[i]>0)
                sum+=b[i];
            else if(sum>0)
                sum--;
            else
                count++;
        }
        System.out.println(java.lang.Math.abs(count));
    }

}
