package ch2;

import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;
        int OT;

        H=sc.nextInt();
        M=sc.nextInt();

        OT=sc.nextInt();


        if(M+(OT%60)>=60){
            H=(H+(OT/60)+1)%24;
            M=(M+(OT%60))%60;
            System.out.println(H+" "+M);
        }
        else{
            H=(H+(OT/60))%24;
            M=M+(OT%60);
            System.out.println(H+" "+M);
        }
        sc.close();
    }
}
