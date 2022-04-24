package ch3;

import java.util.Scanner;

public class Sumcycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=0, c=0, cp=n;
        int count=0;

        if(n<10){
            n=n*10;
        }

        do{
            a=n/10;
            b=n%10;
            c=(a+b)%10;
            n=(b*10)+c;
            count++;
        }while(n!=cp);
        System.out.println(count);

        sc.close();

    }
}
