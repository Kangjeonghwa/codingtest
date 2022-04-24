package ch4;

import java.util.Scanner;

public class PrintMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int arr[] = new int [9];

        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        int Max=arr[0];

        for(int j=0;j<9;j++){
            if (Max<arr[j]){
                Max=arr[j];
                count=j+1;
            }
        }
        System.out.println(Max);
        System.out.println(count);
        sc.close();
    }
}
