package ch9;

import java.util.Scanner;

public class FibonacciSu5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(Fibo(n));
        sc.close();
    }
    static int Fibo(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        
        return Fibo(n-1)+Fibo(n-2);
    }
}
