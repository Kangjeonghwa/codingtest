package ch9;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int F=facto(n);
        System.out.println(F);

        sc.close();
    }
    static int facto(int n){
        if(n<=1){
            return 1;
        }
        
        return n*facto(n-1);
        
    }

    
}
