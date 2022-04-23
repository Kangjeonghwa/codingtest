package ch3;

import java.util.Scanner;

public class PrintStar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        for (int i=0;i<N;i++){
            for (int j=N; j>i+1; j--){
                System.out.printf(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.printf("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
