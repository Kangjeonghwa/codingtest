package ch2;

import java.util.Scanner;

public class Alarmclock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int H, M;
    
        H = sc.nextInt();
        M =sc.nextInt();

        if (M<45){
            if(H==0){
                System.out.println("23 "+(M+15));
            }
            else{
                System.out.println((H-1)+" "+(M+15));
            }
        }
        else{
            System.out.println(H+" "+(M-45));
        }
        sc.close();
    }
   
    
}