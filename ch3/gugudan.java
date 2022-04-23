package ch3;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int j=1; j<10;j++){
            System.out.printf("%d * %d = %d \n", N,j,N*j);
        }
        sc.close();

        
    }
}
