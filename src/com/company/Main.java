package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        String c=a.toLowerCase();
        char[] ch=c.toCharArray();
        HashSet<Character> b= new HashSet<Character>();
        for (int i = 0; i < ch.length ; i++) {
            b.add(ch[i]);
        }
        if (b.size()==26){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
