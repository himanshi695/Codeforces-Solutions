import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int a=0;
        int count=0;
        if (n>=100){

            a=n/100;
            n=n%100;
            count=count+a;
        }
        if (n>=20){

            a=n/20;
            n=n%20;
            count=count+a;
        }
        if (n>=10){
            a=n/10;
            n=n%10;

            count=count+a;
        }
        if (n>=5){
            a=n/5;
            n=n%5;

            count=count+a;
        }
        if (n>=1){
            a=n/1;
            n=n%1;

            count=count+a;
        }
        System.out.println(count);
    }
}
