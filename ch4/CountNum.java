package ch4;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        int[] arr1={0,0,0,0,0,0,0,0,0,0};
        //int arr2[]=new int [9];
        int Mul=A*B*C;
        String str=String.valueOf(Mul);
        
        for(int i=0;i<9;i++){
            String b=str.substring(i,i+1);
            int a=Integer.parseInt(b);
            arr1[a]++;
        }
        for(int j=0;j<9;j++){
            System.out.println(arr1[j]);
        }
        sc.close();
        
    }
}
