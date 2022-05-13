package ch7;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int cnt=1;

        if (B>C){
            System.out.println("-1");
        }
        else{
            while(true){
                if((A+B*cnt)>=C*cnt){
                    cnt++;
                }
                else{
                    System.out.println(cnt);
                    break;
                }
            }
            
        }
        sc.close();
    }
}
