package ch3;

import java.util.List;
import java.util.Scanner;

public class AplusB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        int arr[]=new int[T];

        for (int i=0; i<T; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i]=a+b;
        }
        
        for (int j=0;j<T;j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
