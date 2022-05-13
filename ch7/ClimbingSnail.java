package ch7;

import java.util.Scanner;

public class ClimbingSnail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int V=sc.nextInt();
        int snail=0;
        int cnt=1;

        while(true){
            snail+=A;
            if(snail>=V){
                System.out.println(cnt);
                break;
            }
            snail-=B;
            cnt++;

        }
        sc.close();
    }
}
