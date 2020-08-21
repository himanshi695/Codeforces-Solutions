import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        int c;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b ; j++) {
                if (i%2!=0) {
                    System.out.print("#");
                } else if(i%4==2 && j==b) {
                    System.out.print("#");
                } else if (i%4==0 && j==1){
                    System.out.print("#");
                } else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
