package ch4;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int arr[]=new int [10];
        int carr[]=new int [42];
        int count=0;

        for (int i=0;i<10;i++){
            int a=sc.nextInt();
            carr[a%42]++;
        }
        for(int j=0;j<42;j++){
            if (carr[j]!=0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
