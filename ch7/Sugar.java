package ch7;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        if(N<8){
            if((N%3)==0){
                System.out.println(N/3);
            }
            else if((N%5)==0){
                System.out.println(N/5);
            }
            else{
                System.out.println("-1");
            }
        }
        else{
            int r=N%5;
            switch(r){
                case 0:
                    System.out.println((N/5));
                    break;
                case 1:
                    N-=6;
                    System.out.println(((N/5)+2));
                    break;
                case 2:
                    N-=12;
                    System.out.println(((N/5)+4));
                    break;
                case 3:
                    N-=3;
                    System.out.println(((N/5)+1));
                    break;
                case 4:
                    N-=9;
                    System.out.println(((N/5)+3));
                    break;
            }

        }
        sc.close();
    }
    
}
